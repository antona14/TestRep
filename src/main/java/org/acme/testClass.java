package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-anton")
public class testClass {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloAnton() {
        return "Hello Anton";
    }
}