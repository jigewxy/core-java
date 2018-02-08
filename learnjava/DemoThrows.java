package corejava.learnjava;

 public class DemoThrows {

    public static void check() throws ArithmeticException,NullPointerException
       //  static void check()
         {
          System.out.println("Inside check function");
         throw new ArithmeticException("demo");
        }

     public static void main(String args[]) {
         try {
             check();
         } catch (ArithmeticException e) {
             System.out.println("caught" + e);
         }
         finally
         {
             System.out.println("finally is always executed");

         }
     }

 }