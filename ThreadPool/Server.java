
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server{
    private final ExecutorService threadPool;

    public Server(int poolSize){
        this.threadPool = Executors.newFixedThreadPool(poolSize);
    }

    public void handleClient(Socket clientSocket){
        try(PrintWriter toSocket = new PrintWriter(clientSocket.getOutputStream() , true)){
            toSocket.println("Hello from Server ThreadPool " + clientSocket.getInetAddress());
        }catch(IOException e){
            System.out.println("Handle Client Error");
        }
    }

    public static void main(String[] args) {
        int port = 8010;
        int poolSize = 10;
        Server server = new Server(poolSize);

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(70000);
            System.out.println("Server is Listining on port " + port);

            while(true){
                Socket clienSocket = serverSocket.accept();
                server.threadPool.execute(() -> server.handleClient(clienSocket));
            }
        } catch (Exception e) {
            System.out.println("Main Method Error");
        }finally{
            server.threadPool.shutdown();
        }
    }


}