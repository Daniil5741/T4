package Study;

public class ThreadTester {
    public static void main(String[] args) {

            Runnable threadJob=new MyRunnable();
            Thread mythread =new Thread(threadJob);

            mythread.start();
            System.out.println("Возвращаемся в метод main");

    }
}
