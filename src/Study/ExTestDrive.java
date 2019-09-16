package Study;

public class ExTestDrive {
    public static void main(String[] args) {
        String test = "yes";
        System.out.print("t");
        System.out.print("h");
        try {
            doRisky(test);
            System.out.print("r");
            System.out.print("o");
        } catch (MyEx myEx) {
           // myEx.printStackTrace();
            System.out.print("a");
        } finally {
            System.out.print("w");
            System.out.print("s");
        }
    }
    static void doRisky(String t) throws MyEx{
            if("yes".equals(t)){
                throw new MyEx();
            }
    }
}
