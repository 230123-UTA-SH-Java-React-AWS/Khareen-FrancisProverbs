import com.revature.controllers.EmployeeController;
import com.revature.utils.ConnectionUtil;
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class App {

  public static void main(String[] args) throws Exception {
//    System.out.println("Starting Backend Server...");
//
//    HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
//    server.createContext("/employee", new EmployeeController());
//
//    server.setExecutor(null);
//    server.start();

    ConnectionUtil.getConnection();
  }
}
