package com.mattt.javagrettystarter.api.v1.resource;

import com.mattt.javagrettystarter.api.v1.dto.hello.Greeting;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("api/v1/hello/")
public class Hello {

  @GET
  public Greeting sayHello() {
    return Greeting.builder()
        .greeting("Hello World!")
        .build();
  }
}
