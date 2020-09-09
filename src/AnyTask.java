import java.util.Scanner;

public class AnyTask {
    static double power(double r, int k) {
        double ans;
        if (k == 1) {
            return r;
        }
        ans = r * power(r, k - 1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 1.00832;
        int m = 120;
        double ans = 0;
        for (int i = 0; i < 120; i++) {
            ans += 1/power(r, m - i);
        }
        System.out.println(ans);
    }
}
