package app;

import io.jooby.Jooby;
import io.jooby.ServerOptions;

public class App extends Jooby {

  public App() {
    String portStr = System.getenv("PORT");
    if (portStr == null) {
      portStr = "8080";
    }
    setServerOptions(new ServerOptions().setPort(Integer.parseInt(portStr)));
  }

  {
    // declaração de rotas
    mvc(new Controller());
    mvc(new Add());
    mvc(new Subtraction());
    mvc(new Division());
    mvc(new Multiplier());
  }

  public static void main(String[] args) {
    runApp(args, App::new);
  }
}
