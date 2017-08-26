package com.hw.hackathon.services;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.hw.hackathon.model.User;

public class LoginService {
	
	final static Logger logger = Logger.getLogger(LoginService.class);
	
	@POST
	@Path("/login")
	@Produces("application/json")
	@Consumes("application/json")
	public Object login(@HeaderParam("authorization") String authString) {
 
		logger.debug("Logging in  User::");
		
//		logger.debug("User Attribute::" + user.getName());
		if(!isUserAuthenticated(authString)){
            return "{\"error\":\"User not authenticated\"}";
        }
		
		
		return Response.status(200).entity("").build();
 
	}
	
	 private boolean isUserAuthenticated(String authString){
         
	        String decodedAuth = "";
	        // Header is in the format "Basic 5tyc0uiDat4"
	        // We need to extract data before decoding it back to original string
	        String[] authParts = authString.split("\\s+");
	        String authInfo = authParts[1];
	        // Decode the data back to original string
	        byte[] bytes = null;
	        try {
	            bytes = new BASE64Decoder().decodeBuffer(authInfo);
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        decodedAuth = new String(bytes);
	        System.out.println(decodedAuth);
	         
	      
	         
	        return true;
	    }

}
