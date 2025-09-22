package de.fs.openapibeanvalidation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("missing")
public class MissingResource {

    @GET
    public String getSomething() {
        return "Hello World!";
    }
}
