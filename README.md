# Java Getting Started Guide

You can use your preferred Java build tool (e.g maven, gradle) to generate the Barking client code.


## Generating a Barking Client

There are a number of ways that you can generate client code from the WSDL that you were provided.

One of these ways is to use the [Apache CXF](http://cxf.apache.org/) library, gradle and the [wsdl2java gradle plugin](https://github.com/nilsmagnus/wsdl2java).

Here is an example: [build.gradle](build.gradle)
Before running ensure both the java package name of the generated code and the path to the WSDL file are correct.

    wsdl2java{
        wsdlsToGenerate = [
                ["-autoNameResolution", 
                    "-p", "com.barking.webservice.client.generated",
                    "$projectDir/src/main/resources/wsdl/webservice.wsdl"]
        ]


## Create the Service client

	WebService service = new WebService();
	WebBarking port = service.getWebPort();


## Set the Endpoint 

	BindingProvider portBP = (BindingProvider)port;
	
    //TODO set to the correct endpoint
	String endpoint = "https://{hostname}/soap/barking/integration/webservice?wsdl";
	portBP.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

## Sending Data to Playpen

### Prepare the Request

    ObjectFactory objFactory = new ObjectFactory();
    Job job = objFactory.createJob();
    
    //TODO set mandatory fields on job
    job.setJobId("Job" + UUID.randomUUID());
    
    //TODO set optional fields on job


### Call the Web Service Operation

 	Result result = port.createJob(job);


### Check the Response

    if(result.isSuccess())
    {
    	//TODO implement success logic
    }
    else
    {
    	//TODO implement failure logic
    }

## Extracting Data from Barking

### Prepare the Request

The easiest way to extract data is to set the export flag to true so that Barking will return all data that has not already been exported. You can then periodically call this (e.g. every 5 minutes) and you will only get new data each time.

    ExportStatusUpdates2 exportStatusUpdatesRequest = objFactory.createExportStatusUpdates2();
	exportStatusUpdatesRequest.setExport(true);

### Call the Web Service Operation		
		
	ResultExportStatusUpdates exportStatusUpdatesResponse = port.exportStatusUpdates(exportStatusUpdatesRequest);
		
### Check the Response
				
    if(exportStatusUpdatesResponse.isSuccess())
    {
        for(EStatus eStatus : exportStatusUpdatesResponse.getEStatusUpdate())
        {
            //TODO save each returned eStatus and take any required actions
        }
    }

## Extracting PDF Reports from Barking

Before trying to extract PDF reports from the Barking Web Service, you will need to check that this feature is enabled for your system.

When you call an Operation like exportJobs, it can return 1 or more reports. You will need to decode each report data using [java.util.Base64](https://docs.oracle.com/javase/8/docs/api/java/util/Base64.html) from Java 8 and then save it to a persistent store like the filesystem or a database using the report name (e.g. Retriever AU Service Report_JOB123_20170703.pdf).

    ResultExportJobs response = myPort.exportJobs(exportJobsRequest);
    if(response.isSuccess())
    {
        for(EJob eJob : response.getEJob())
        {
            for(EReport eReport : eJob.getEReport())
            {
                // decode the report data which is base64 encoded
                byte[] pdfContents = Base64.getMimeDecoder().decode(
                    eReport.getReportData());                 
                // save the report to the file system
                try 
                {
                    Files.write(Paths.get("c:/reports/" + eReport.getReportName()),
                        pdfContents);                        
                } 
                catch (IOException e) 
                {
                    //TODO handle exception    
                }
            }
        }
    }

## Set Datetime Fields

In Java, to set datetime fields like a Job's start date, you will need to create an XMLGregorianCalendar. Here is an example that assumes you have a Date object with the correct start date, time and timezone: 

    String DATETIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    DateFormat format = new SimpleDateFormat(DATETIME_FORMAT);
    Date startDate = new Date();
    XMLGregorianCalendar startDateXML =
        DatatypeFactory.newInstance().newXMLGregorianCalendar(
            format.format(startDate));
    job.setStartDate(startDateXML);