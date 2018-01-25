package org.indranil.learning.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {
	
	@GET
	@Path("annotations")
	// The below can be used as below :
	//http://localhost:8080/messenger/webapi/injectdemo/annotations;param=98384
	public String getParamsUsingAnnotations(@MatrixParam("param") String matrixParam, 
											@HeaderParam("customHeaderParam") String header,
											@CookieParam("name") String cookie) {
		return "matrixParam : "+ matrixParam + " custom Header Param : "+ header + " Cookie : "+cookie;
	}
	
	//@FormParam is also there
	
	@GET
	@Path("context")
	
	public String getParamsUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders headers) {
		String path = uriInfo.getAbsolutePath().toString();
		String cookies = headers.getCookies().toString();
		return "Path : "+ path + " Cookies : "+ cookies;
	}

}
