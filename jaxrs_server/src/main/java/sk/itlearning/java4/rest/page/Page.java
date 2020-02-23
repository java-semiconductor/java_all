package sk.itlearning.java4.rest.page;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("test")
public class Page {

	private static List<Integer> response;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response doTest() {
		JsonObjectBuilder jb = Json.createObjectBuilder();

		jb.add("cas_get", "");

		return Response.ok(jb.build()).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response urobNieco() {
		JsonObjectBuilder jb = Json.createObjectBuilder();

		jb.add("cas_post", "");

		return Response.ok(jb.build()).build();
	}
	
	@DELETE
	@Produces(MediaType.TEXT_HTML)
	@Path("delete/{id}")
	public Response delete(@PathParam("id") int id) {
		
		response = new ArrayList<>();
		
		response.add(1);
		response.add(2);
		
		response.remove(id);
		
		final StringBuffer resp = new StringBuffer();
		
		response.forEach(resp::append);
		
		return Response.ok(resp.toString()).build();
	}

}
