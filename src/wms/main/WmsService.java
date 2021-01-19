package wms.main;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import wms.beans.Receptie;
import wms.beans.Status;
import wms.beans.TaskUser;
import wms.beans.User;
import wms.model.OperatiiPregatire;
import wms.model.OperatiiUser;
import wms.test.GenereazaReceptie;

@Path("wmsservice")
public class WmsService {

	@Path("test")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response testService(@QueryParam("utilizator") String utilizator, @QueryParam("utilaj") String utilaj) {

		String resp = "Hello " + utilizator + " , " + utilaj;

		return Response.status(200).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.header("Access-Control-Max-Age", "1209600").entity(resp).build();

	}

	@Path("login")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(@FormParam("codUser") String codUser, @FormParam("codUtilaj") String codUtilaj) {

		User user = new User();
		user.setNume("Nume Utilizator");
		user.setCod(codUser);
		user.setTipAngajat("TipAngajat");
		user.setLoginSucces(true);
		user.setTaskUser(new OperatiiUser().getTaskUser(codUser, codUtilaj));

		return Response.status(200).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.header("Access-Control-Max-Age", "1209600").entity(user).build();
	}
	
	@Path("taskUser")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTaskUser(@FormParam("codUser") String codUser, @FormParam("codUtilaj") String codUtilaj){
		TaskUser taskUser = new OperatiiUser().getTaskUser(codUser, codUtilaj);
		
		return Response.status(200).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.header("Access-Control-Max-Age", "1209600").entity(taskUser).build();
	}
	
	
	@Path("materialReceptie")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMaterialReceptie(@FormParam("idReceptie") String idReceptie, @FormParam("codBare") String codBare){
		
		Receptie materialReceptie = new GenereazaReceptie().genereazeReceptieMaterial(idReceptie, codBare);
		
		return Response.status(200).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.header("Access-Control-Max-Age", "1209600").entity(materialReceptie).build();
	}
	
	@Path("salveazaTaskPregatire")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveTaskPregatire(@FormParam("params") String params){
		
		Status status = new OperatiiPregatire().salveazaTaskPregatire(params);
		
		return Response.status(200).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.header("Access-Control-Max-Age", "1209600").entity(status).build();
		
	}

}
