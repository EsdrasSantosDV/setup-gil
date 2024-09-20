package rest;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/user")
public class ControllerUser {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "ESDRAS TESTE";
    }
}
