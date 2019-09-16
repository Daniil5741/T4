package Labs;

        import java.util.Scanner;

public class Labs1 {
   static Scanner scanner;
    static void A(){
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        scanner=new Scanner(System.in);
       A();
    }
}
