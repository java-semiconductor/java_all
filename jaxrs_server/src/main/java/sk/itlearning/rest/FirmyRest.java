package sk.itlearning.rest;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("firmy")
public class FirmyRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFirmy() {
		
		JsonObjectBuilder jb = Json.createObjectBuilder();
		jb.add("name", "ON");
		
		return Response.ok(jb.build()).build();
	}

}
