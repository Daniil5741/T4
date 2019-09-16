import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Lab1 {
    FastScanner in;
    PrintWriter out;

    private void solve() throws IOException {
        int n = in.nextInt();
        double[] ar = new double[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextDouble();
        }

        double[] br = new double[n];

        for (int i = 0; i < n; i++) {
            br[i] = ar[i];
        }
        double key = 0;
        for (int i = 1; i < n; i++) {
            key = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = key;
        }
        double left = ar[0];
        double middle = ar[n / 2];
        double hight = ar[n - 1];
        for (int i = 0; i < br.length; i++) {
            if (left == br[i]) {
                left = i + 1;
                break;
            }
        }
        for (int i = 0; i < br.length; i++) {
            if (middle == br[i]) {
                middle = i + 1;
                break;
            }
        }
        for (int i = 0; i < br.length; i++) {
            if (hight == br[i]) {
                hight = i + 1;
                break;
            }
        }
        out.print((int)left + " " + (int)middle + " " + (int)hight);

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
         new FastScanner(new FileInputStream("sortland.in"));
         out = //new PrintWriter(System.out);
         new PrintWriter(new FileOutputStream("sortland.out"));
        solve();
        out.flush();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Lab1().run();
    }
}