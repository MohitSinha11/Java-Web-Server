
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server{
    public Consumer<Socket>getConsumer(){

        // Purpose of this method 
        /*
            “Client jab connect karta hai server se, server unhe ek simple greeting message 
             send karta hai aur connection close kar deta hai.”
         */
        
        // METHOD 1 -> Anonymous Inner Class
        /*
        return new Consumer<Socket>(){
            @Override
            public void accept(Socket clientSocket){
               try {
                    PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
                    toClient.println("-----Hello From the Server-----");
                    toClient.close();
                    clientSocket.close();
                } catch (IOException e) {
                    System.out.println("Client Socket error from SERVER SIDE ");
                }
            }
        };
        */
        
        // METHOD 2 -> Lambda Expression
        return(clientSocket)->{
            try {
                PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
                toClient.println("-----Hello From the Server-----");
                toClient.close();
                clientSocket.close();
            } catch (IOException e) {
                System.out.println("Client Socket error from SERVER SIDE ");
            }
        };
    }
    public static void main(String[] args) {
        int port = 8010;
        Server server = new Server();
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(10000);
            System.out.println("Server is Listening at port "+port);

            while (true) { 
                Socket acceptedSocket = serverSocket.accept();
                Thread thread = new Thread(()->server.getConsumer().accept(acceptedSocket));
                thread.start();
            }
        } catch (Exception e) {
            System.out.println("Server Socket Error -----> " + e.getMessage());
        }
    }
}