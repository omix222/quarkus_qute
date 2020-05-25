package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.Template;

import java.math.BigDecimal;

@Path("item")
public class ItemResource {


    @Inject
    Template item;

    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_HTML)
    public String get(@PathParam("id") Integer id) {
        return item.data("item", new Item(String.valueOf(id), BigDecimal.valueOf(100))).render();
    }

}