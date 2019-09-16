package Study;

public class TestExceptions {
    public static void main(String[] args) {
        String text="yes";
        try {
            System.out.println("Начало try");
            doRisky(text);
            System.out.println("Конец try");
        } catch (Exception e) {
            System.out.println("Жуткое исключение");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("конец main");
    }
    static  void doRisky(String test)throws  Exception{
        System.out.println("Начало опасного метода");
        if("yes".equals(test)){
            throw new Exception();
        }
        System.out.println("Конец опасного метода");
        return;
    }
}
