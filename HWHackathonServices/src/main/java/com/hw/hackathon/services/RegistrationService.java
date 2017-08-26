package com.hw.hackathon.services;
 
import org.apache.log4j.Logger;

import com.hw.hackathon.model.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
/**
 * @author Krushna
 *
 */
@Path("/Meetup")
public class RegistrationService {
 
	
	final static Logger logger = Logger.getLogger(RegistrationService.class);
	@POST
	@Path("/register")
	@Produces("application/json")
	@Consumes("application/json")
	public Response register(User user) {
 
		logger.debug("Registering User::");
		
		logger.debug("User Attribute::" + user.getName() + "::" + user.getIntersts() + "::" + user.getLocation());
 
		
		
		return Response.status(200).entity("").build();
 
	}
	
	
	@POST
	@Path("/login")
	@Produces("application/json")
	@Consumes("application/json")
	public Response login(String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}