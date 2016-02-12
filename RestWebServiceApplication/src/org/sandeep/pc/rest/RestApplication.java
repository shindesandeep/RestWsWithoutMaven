package org.sandeep.pc.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.sandeep.pc.rest.model.UserDetails;
import org.sandeep.pc.rest.service.UserDetailsService;

@Path("/user")
public class RestApplication extends Application{
	UserDetailsService userDetailsService = new UserDetailsService();
	
	@GET
	@Path("/users")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<UserDetails> getUserDetails(){
		
		return userDetailsService.getUserDetails();
	}
	
	@GET
	@Path("/users/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public UserDetails getUserDetails(@PathParam("id") long id){		
		return userDetailsService.getUserDetails(id);
	}
}
