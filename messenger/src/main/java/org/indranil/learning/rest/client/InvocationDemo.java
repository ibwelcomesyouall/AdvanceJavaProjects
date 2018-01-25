package org.indranil.learning.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class InvocationDemo {

	public static void main(String[] args) {
		
		InvocationDemo demo = new InvocationDemo();
		Invocation invocation = demo.prepareRequestForMessagesByYear(2018);
		Response response = invocation.invoke();
		
		System.out.println(response.getStatus());

	}
	
	public Invocation prepareRequestForMessagesByYear(int year) {
		
		Client client = ClientBuilder.newClient();
		
		return client.target("http://localhost:8080/messenger/webapi/")
				.path("messages")
				.queryParam("year",year)
				.request(MediaType.APPLICATION_JSON)
				.buildGet();
		
	}

}
