package Study;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {

    String[] adviceList = {"Ешьте меньшими порциями", "КУпите облегчающие Джинсы.Нет, они делают вас полнее."
            , "Два слова:не годится", "Будьте честными хотя бы сегодня .Скажите своему начальнику все,что вы  *на саммо деле* думаете о нем",
            "Возможно,вам стоит подобрать другую прическу"};

    public static void main(String[] args) {
        DailyAdviceServer adviceServer = new DailyAdviceServer();
        adviceServer.go();
    }

    void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            while (true) {
                Socket socket = serverSocket.accept();

                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }
}