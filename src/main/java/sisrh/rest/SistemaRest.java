package sisrh.rest;

import java.util.*;
import java.text.*; 
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import io.swagger.annotations.*;

@Api
@Path("/sistema")
public class SistemaRest {
	@GET
	@Path("ping")
	@Produces(MediaType.TEXT_PLAIN)
	public Response ping() {
		UUID uuid = UUID.randomUUID();
		return Response.ok().entity("pong: " + uuid).build();
	}

}
