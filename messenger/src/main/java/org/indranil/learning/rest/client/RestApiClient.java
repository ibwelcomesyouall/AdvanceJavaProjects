package org.indranil.learning.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.indranil.learning.messenger.model.Message;

public class RestApiClient {

	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		/*
		Response response = client.target("http://localhost:8080/messenger/webapi/messages/2").request().get();
		Message message = response.readEntity(Message.class);
		System.out.println(message.getMessage());
		*/
		
		WebTarget baseTarget = client.target("http://localhost:8080/messenger/webapi/");
		WebTarget messagesTarget = baseTarget.path("messages");
		WebTarget singleMessageTarget = messagesTarget.path("{messageId}");
		
		Message message1 = singleMessageTarget
				.resolveTemplate("messageId", "1")
				.request(MediaType.APPLICATION_JSON)
				.get(Message.class);
		
		Message message2 = singleMessageTarget
				.resolveTemplate("messageId", "2")
				.request(MediaType.APPLICATION_JSON)
				.get(Message.class);
		
		
		Message newMessage = new Message(3,"My message from JAX-RS CLient", "Twinkle");
		Response postResponse = messagesTarget.request().post(Entity.json(newMessage));
		
		if(postResponse.getStatus() != 201) {
			System.out.println("Error ");
		}
		
		
		System.out.println(message1.getMessage());
		System.out.println(message2.getMessage());
		Message createdMessage = postResponse.readEntity(Message.class);
		System.out.println(createdMessage.getMessage());
		

	}

}
