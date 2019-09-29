package Study;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadFileText {
    public static void main(String[] args) {
        LoadFileText loadFileText=new LoadFileText();
        loadFileText.load();
    }
    void load(){
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("Test"));
            String s=bufferedReader.readLine();
            String [] str=s.split(" ");
            int []a=new int[str.length];
            for (int i = 0; i <str.length ; i++) {
                a[i]=Integer.parseInt(str[i]);
                System.out.print(a[i]+" ");
            }
            bufferedReader.close();;
            //System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
