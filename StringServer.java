import java.io.IOException;
import java.net.URI;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

class Handler implements URLHandler {
  // The one bit of state on the server: a number that will be manipulated by
  // various requests.
  //int num = 0;
  String path = "";
  public String handleRequest(URI url) {
    System.out.println(url);
      if (url.getPath().equals("/add-message")) {
        System.out.println("IT WORKED");
        String query = url.getQuery();
        if (query.startsWith("s=")) {
          String message = query.substring(2);
          path += "\n" + message;
          return path;
        } else { return "Invalid query parameter";}
      }
      else { return "404 Not Found"; }
  }
}

public class StringServer {
  
  public static void main(String[] args) throws IOException {
    if(args.length == 0){
        System.out.println("Missing port number! Try any number between 1024 to 49151");
        return;
    }

    int port = Integer.parseInt(args[0]);

    Server.start(port, new Handler());
}
  
}
