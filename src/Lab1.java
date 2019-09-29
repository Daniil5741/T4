import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import static java.util.Collections.*;

public class Lab1 {
    FastScanner in;
    PrintWriter out;

    public static void quickSort(int[] ar, int l, int r) {
        if (ar.length == 0)
            return;

        if (l >= r)
            return;

        int q = (int) ((Math.random() * ((r - l) + 1)) + l);
        int selected = ar[q];

        int i = l, j = r;
        while (i <= j) {
            while (ar[i] < selected) {
                i++;
            }
            while (ar[j] > selected) {
                j--;
            }
            if (i <= j) {//меняем местами
                int t = ar[i];
                ar[i] = ar[j];
                ar[j] = t;
                i++;
                j--;
            }
        }
        if (l < j)
            quickSort(ar, l, j);//для левой сортировки

        if (i < r)
            quickSort(ar, i, r);//для правой сортировки
    }

    //    int findOrderStatistic(int[] array, int k) {
//        int left = 0, right = array.length;
//        while (true) {
//           // int mid = partition(array, left, right);
//
//            if (mid == k) {
//                return array[mid];
//            }
//            else if (k < mid) {
//                right = mid;
//            }
//            else {
//                left = mid + 1;
//            }
//        }
//    }
    private void solve() throws IOException {
        int n = in.nextInt();

        ArrayList<String[]> countries = new ArrayList<>();

        String[] str = new String[n];
        int j =0;
        for (int i = 0; i < 3; i++) {
            String s =in.next();
          if (!countries.contains(s)){

          }
        }


    }

    class FastScanner {
        StringTokenizer st;
        BufferedReader br;

        FastScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        boolean hasNext() throws IOException {
            return br.ready() || (st != null && st.hasMoreTokens());
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }

        boolean hasNextLine() throws IOException {
            return br.ready();
        }
    }

    private void run() throws IOException {
        in = //new FastScanner(System.in);
                new FastScanner(new FileInputStream("sort.in"));
        out = //new PrintWriter(System.out);
                new PrintWriter(new FileOutputStream("sort.out"));
        solve();
        out.flush();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Lab1().run();
    }
}