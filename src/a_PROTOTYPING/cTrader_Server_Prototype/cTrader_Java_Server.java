package a_PROTOTYPING.cTrader_Server_Prototype;

import java.io.*;
        import java.net.*;
        import java.util.concurrent.*;

public class cTrader_Java_Server
{
    public static void main(String[] args) {
        int port = 6000; // Server port

        ExecutorService executor = Executors.newFixedThreadPool(10);

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                executor.submit(() -> handleClient(socket));
            }
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void handleClient(Socket socket) {
        try (InputStream input = socket.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input));
             OutputStream output = socket.getOutputStream();
             PrintWriter writer = new PrintWriter(output, true)) {

            String message = reader.readLine();
            System.out.println("Received: " + message);

            if ("Hello".equals(message)) {
                writer.println("Good Morning");
            }

        } catch (IOException ex) {
            System.out.println("Client handler exception: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}