package com.cds.pcrj.consultaMoeda;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.rmi.RemoteException;

import org.apache.axis2.axis2userguide.FachadaWSSGSServiceStub;
import org.apache.commons.httpclient.methods.FileRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.common.io.CharStreams;

import was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLDocument;
import was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLDocument.GetUltimoValorXML;
import was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument;
import was_p.wssgs.services.fachadawssgs.GetUltimoValorXMLResponseDocument.GetUltimoValorXMLResponse;

public class CotacaMoedaBean {

	public org.xmlsoap.schemas.soap.encoding.String xmlResponse(Long pSerie) throws RemoteException {
		FachadaWSSGSServiceStub stub = new FachadaWSSGSServiceStub("https://www3.bcb.gov.br/wssgs/services/FachadaWSSGS");// "https://www3.bcb.gov.br/wssgs/services/FachadaWSSGS"
		GetUltimoValorXMLDocument req = GetUltimoValorXMLDocument.Factory.newInstance();
		GetUltimoValorXML data = req.addNewGetUltimoValorXML();
		data.setIn0(pSerie);
		GetUltimoValorXMLResponseDocument ultimoValorXML = stub.getUltimoValorXML(req);
		GetUltimoValorXMLResponse response = ultimoValorXML.getGetUltimoValorXMLResponse();
		org.xmlsoap.schemas.soap.encoding.String xmlReturn = response.getGetUltimoValorXMLReturn();
		return xmlReturn;
	}
//
	public static void main(String[] args) {
		// FachadaWSSGSServiceStub stub = new
		// FachadaWSSGSServiceStub("https://www3.bcb.gov.br/wssgs/services/FachadaWSSGS");
//		try {
//			new CotacaMoedaBean().getMoeda("1");
//			// stub = new FachadaWSSGSServiceStub("");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		 if (args.length != 3) {
	            System.out.println("Usage: java -classpath <classpath> [-Dorg.apache.commons.logging.simplelog.defaultlog=<loglevel>] PostSOAP <url> <soapaction> <filename>]");
	            System.out.println("<classpath> - must contain the commons-httpclient.jar and commons-logging.jar");
	            System.out.println("<loglevel> - one of error, warn, info, debug, trace");
	            System.out.println("<url> - the URL to post the file to");
	            System.out.println("<soapaction> - the SOAP action header value");
	            System.out.println("<filename> - file to post to the URL");
	            System.out.println();
	            System.exit(1);
	        }
	        // Get target URL
	        String strURL = args[0];
	        // Get SOAP action
	        String strSoapAction = args[1];
	        // Get file to be posted
	        String strXMLFilename = args[2];
	        File input = new File(strXMLFilename);
	        // Prepare HTTP post
	        PostMethod post = new PostMethod(strURL);
	        // Request content will be retrieved directly
	        // from the input stream
	        RequestEntity entity = new FileRequestEntity(input, "text/xml; charset=ISO-8859-1");
	        post.setRequestEntity(entity);
	        // consult documentation for your web service
	        post.setRequestHeader("SOAPAction", strSoapAction);
	        // Get HTTP client
	        HttpClient httpclient = HttpClientBuilder.create().build();
	        // Execute request
	        try {
	            int result = httpclient.execute(post);
	            // Display status code
	            System.out.println("Response status code: " + result);
	            // Display response
	            System.out.println("Response body: ");
	            System.out.println(post.getResponseBodyAsString());
	        } finally {
	            // Release current connection to the connection pool once you are done
	            post.releaseConnection();
	        }
	}
	public String getMoeda(String codSerie) {
		System.out.println("Código Série digitado no header ="  +codSerie);
    	String responseAsString = null;
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost("https://www3.bcb.gov.br/wssgs/services/FachadaWSSGS");
		request.addHeader("in0", codSerie);
		HttpResponse response = null;
		try {
			response = client.execute(request);

			InputStream inputStream = response.getEntity().getContent();
			responseAsString = CharStreams.toString(new InputStreamReader(inputStream, "UTF-8"));
			System.out.println(response.getStatusLine().getStatusCode());
			System.out.println("Executou o Moeda bean"+responseAsString);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return responseAsString;
    }
	
	

}
