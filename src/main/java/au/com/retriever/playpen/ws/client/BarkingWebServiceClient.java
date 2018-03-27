package au.com.retriever.playpen.ws.client;
/*
 * Copyright: Retriever Communications Copyright (c) 2017
 * 
 * This document is the property of Retriever Communications Ltd. No part of it may be circulated,
 * quoted, or reproduced for distribution outside Retriever Communications Ltd. Any party not
 * previously authorised, in writing, by Retriever Communications Ltd. to discuss or use these
 * contents should not disclose these contents. All hard copies must be returned and soft copies
 * destroyed upon request.
 */

import java.util.UUID;
import javax.xml.ws.BindingProvider;
import au.com.retriever.playpen.ws.client.generated.Job;
import au.com.retriever.playpen.ws.client.generated.ObjectFactory;
import au.com.retriever.playpen.ws.client.generated.Result;
import au.com.retriever.playpen.ws.client.generated.Web;
import au.com.retriever.playpen.ws.client.generated.WebService;

public class BarkingWebServiceClient {
    public static void main(String[] args) {
        // create the client
        WebService service = new WebService();
        Web port = service.getWebPort();

        // set the endpoint and credentials
        BindingProvider portBP = (BindingProvider) port;
        // TODO set to the correct endpoint
        String endpoint =
                "http://localhost:9191/soap/barking/integration/webservice?wsdl";
        portBP.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

        // prepare the request
        ObjectFactory objFactory = new ObjectFactory();
        Job job = objFactory.createJob();
        job.setJobId("Job" + UUID.randomUUID());
        job.setCustomerName("Customer1");
        job.setAddress1("Address1");
        job.setJobDesc("JobDesc1");

        // call the web service operation
        Result result = port.createJob(job);

        // check the response
        System.out.println("Result success: " + result.isSuccess() + " txId: " + result.getTxId()
                + " Error Msg: " + result.getErrorMsg() + " (Code: " + result.getErrorCode()
                + ").");
    }
}
