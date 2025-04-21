package sisrh.rest;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;

import io.swagger.annotations.Api;
import sisrh.banco.Banco;
import sisrh.dto.Empregado;

@Api
@Path("/empregado")
public class EmpregadoRest {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarEmpregados() throws Exception {
		List<Empregado> lista = Banco.listarEmpregados();		
		GenericEntity<List<Empregado>> entity = new GenericEntity<List<Empregado>>(lista) {};
		return Response.ok().entity(entity).build();
	}

}
