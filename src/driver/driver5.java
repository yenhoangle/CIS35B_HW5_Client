package driver;
import client.*;

public class driver5 {
     public static void main(String[] args) {
         String localHost = "127.0.0.1";
         int portNum = 4444;
         DefaultSocketClient client = new DefaultSocketClient(localHost, portNum);
         client.start();
     }
}
