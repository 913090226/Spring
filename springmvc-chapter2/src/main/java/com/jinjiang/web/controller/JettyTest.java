package com.jinjiang.web.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.springframework.stereotype.Component;

@Component
@Path("/test")
public class JettyTest {
	
	@GET
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@Path("/testjetty")
	public Response returnResp()
	{
		return Response.status(Status.OK).entity(new String("jetty run")).build();
		
	}
}
