package com.example;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.Engine;
import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.Template;

@Path("/helloqute")
public class HelloResource {

    @Inject
    Template helloqute;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@QueryParam("name") String name) {
        return helloqute.data("name", name).render();
    }
}