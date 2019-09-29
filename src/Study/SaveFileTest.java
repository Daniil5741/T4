package Study;

import java.io.*;

public class SaveFileTest implements Serializable {

    public static void main(String[] args) {
        SaveFileTest saveFileTest=new SaveFileTest();
        int []ar=new int[10];

        for (int i = 0; i <10 ; i++) {
            ar[i]=(int)(Math.random()*10);
        }
        saveFileTest.save(ar);
    }
    void save(int []array){
        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("Test"));
            for (int i = 0; i <array.length ; i++) {
                bufferedWriter.write(array[i]+" ");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
