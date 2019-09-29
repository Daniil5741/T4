package Study;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer {
    ArrayList clientOutputStreams;

    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket sock;

        public ClientHandler(Socket clientSocket) {
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new VerySimpleChatServer().go();

    }

    void go() {
        clientOutputStreams = new ArrayList();
        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            while (true) {
                Socket clientSocket = serverSocket.accept();

                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("got a connection" + clientSocket.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void tellEveryone(String message) {
        for (int i = 0; i < clientOutputStreams.size(); i++) {
            PrintWriter writer = (PrintWriter) clientOutputStreams.get(i);
            writer.print(message + " R\n");
            writer.flush();
        }
//        Iterator it = clientOutputStreams.iterator();
//        while (it.hasNext()) {
//            try {
//                PrintWriter writer = (PrintWriter) it.next();
//                writer.print(message);
//                writer.flush();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }

}
