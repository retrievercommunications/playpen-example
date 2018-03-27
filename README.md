# Java Getting Started Guide


This guide helps developers get started on using the Playpen interface.
You can use your preferred Java build tool (e.g maven, gradle) to generate the Playpen client code.

**Note:** Due to the limitations of Playpen, the Requests/Responses may not be a one-to-one representation of those used in Barking Integration. It is not recommended to create code here that will be reused with Barking, instead this is designed to simply give a general idea of what to expect when interacting with it.


## Generating a Playpen Client

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

