package app;

import io.jooby.Context;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class UnitTest {

  @Test
  public void welcome() throws IOException {
    Controller controller = new Controller();
    String htmlFilePath = "src/main/resources/index.html";
    String expectedHtml = new String(Files.readAllBytes(Paths.get(htmlFilePath)));

    // Simula um objeto Context para passar como argumento
    Context mockContext = mock(Context.class);

    // Chama o método sayHi() passando o contexto simulado
    String actualHtml = controller.sayHi(mockContext);

    assertEquals(expectedHtml, actualHtml);
  }
}
