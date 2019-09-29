package Study;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doMore();
    }

    void doMore() {
        System.out.println("Вершина стека");
    }
}
