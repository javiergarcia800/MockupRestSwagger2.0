package com.mockup.webservices.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mockup.dto.User;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


@Path("/user/")
@Produces(MediaType.APPLICATION_JSON)
public class UserRest {

	private static final Logger LOG = LogManager.getLogger(UserRest.class);

	
	/*@Operation(	summary = "Busca un usuario por ID", 
	responses = {
				@ApiResponse(responseCode = "200",
						     description = "El usuario",
							 content     = @Content(mediaType = "application/json",
												    schema    = @Schema(implementation = User.class))),
				@ApiResponse(responseCode = "400", description = "User not found")})*/
	
	@GET
	@Path("/validate")
	@ApiResponse(
	        responseCode = "200",
	        content = @Content(
	            mediaType = "application/json",
	            schema    = @Schema(implementation = User.class)
	        ),
	        description = "List of \"Hello, world!\"-messages."
	    )
	public User validate() {
		LOG.debug("validate()...");
		User user = new User();
		user.setUsername("userJAXRS...");
		user.setPassword("passwordJAXRS...");
		return user;
	}

}
