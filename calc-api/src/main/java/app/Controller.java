package app;

import io.jooby.Context;
import io.jooby.annotations.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@Path("/")
public class Controller {

  @GET
  public String sayHi(Context ctx) {
    try {
      String htmlFilePath = "src/main/resources/index.html";
      String htmlContent = new String(Files.readAllBytes(Paths.get(htmlFilePath)));
      ctx.setResponseType("text/html");
      return htmlContent;
    } catch (Exception e) {
      return "Erro ao carregar o arquivo HTML.";
    }
  }
}
