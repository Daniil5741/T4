package Study;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTesting {
    String Name;

    public static void main(String[] args) {
        ArrayList<Song> str = new ArrayList<>();
        str.add(new Song("Pink Moon"));
        str.add(new Song("Somersault"));
        str.add(new Song("Shiva Moon"));
        str.add(new Song("Circles"));
        str.add(new Song("Deep Channel"));
        str.add(new Song("Passenger"));
        str.add(new Song("Listen"));
        str.add(new Song("Listen"));
        str.add(new Song("Circles"));
        HashSet<Song> hashSet=new HashSet<Song>();
        hashSet.addAll(str);

        System.out.println(hashSet);
    }
}
