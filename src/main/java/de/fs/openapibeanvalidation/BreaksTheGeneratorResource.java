package de.fs.openapibeanvalidation;

import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("beanvalidation")
public class BreaksTheGeneratorResource {

    @POST
    public Response noPathParam(@Valid @NotEmpty List<String> myList) {
        return Response.ok("It works - " + myList.get(0)).build();
    }

}
