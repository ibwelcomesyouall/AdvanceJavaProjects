package org.indranil.learning.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
// The above annotation is option in case of sub resources
public class CommentResource {
	
	@GET
	public String test() {
		return "new sub resource";
	}
	
	@GET
	@Path("/{commentId}")
	public String test2(@PathParam("messageId") long messageId, @PathParam("commentId") long commentID) {
		return "Method to return commentID : "+commentID+" for message " + messageId;
	}

}
