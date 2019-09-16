import java.util.Scanner;

public class Main {
    int s;
    int x = 12;

    public static void go(final int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[10];
        // int[] ar = new int[]{2,10,5,3,7,0};
        for (int i = 0; i < 10; i++) {
            ar[i] = (int) (Math.random() * 10);
        }
      int key=0;
        for (int i = 1; i <ar.length ; i++) {
            key=ar[i];
            int j=i-1;
            while(j>=0&&ar[j]>key){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

    }

}
