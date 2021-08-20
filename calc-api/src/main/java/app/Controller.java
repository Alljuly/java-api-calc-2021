package app;

import io.jooby.annotations.*;

@Path("/")
public class Controller {

  @GET
  public String sayHi() {
    return "Oi, sou a api da Alice!";
  }
}
