package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
    void go() {
        try {
            Socket s = new Socket("127.0.0.1", 10000);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader =new BufferedReader(streamReader);

            String advice=reader.readLine();
            System.out.println("Сегдня ты должен "+advice);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client=new DailyAdviceClient();
        client.go();
    }
}
