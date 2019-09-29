package Study;

public class MyOuther {
    private int x;
    MyInner inner = new MyInner();

    public  void doStuff(){
        inner.go();
    }

    class MyInner {
        void go() {
            x = 42;
        }

    }
}
