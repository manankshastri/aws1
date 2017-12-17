import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {//Keep this number. For the pace server this is the number we must use.
            serverSocket = new ServerSocket(22);
            Socket clientSocket = null;
            clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("I am the server");
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
            System.exit(0);
        }
    }
}