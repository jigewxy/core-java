package learnjava;


// synchronized method will make sure the Object is accessed by one function only, to avoid racing condition.
//without synchronized keyword, we will have a different result here.

class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
     //   public void increment() {

            c++;
    }

   public synchronized void decrement() {
  //     public void decrement() {

            c--;
    }

    public synchronized int value() {
   //     public int value() {

            return c;
    }
}

public class DemoSychroMethod {

    static boolean contextSwitch = false;

    public static void main (String[] args){

        SynchronizedCounter count = new SynchronizedCounter();


        Thread t1 = new Thread() {

            public synchronized void run (){

                for(int i=0; i<100; i++)
                {
                    try{

                        Thread.sleep(10);

                    }catch(InterruptedException ie){}
                    count.increment();

                    System.out.println("Thread T1: increment to count-"+i);
                    System.out.println("increment: "+count.value());

                }
                System.out.println("Going to notify t2");

                contextSwitch = true;
                notify();

            }

        };

        Thread t2= new Thread() {

            public synchronized void run (){

                      if(contextSwitch==false) {
                          try {
                              wait();
                          } catch (InterruptedException ie) {
                          }
                      }

                for(int i=0; i<100; i++)
                {
                    try{

                        Thread.sleep(10);

                    }catch(InterruptedException ie){}
                    count.decrement();

                    System.out.println("Thread T2: decrement to count-"+i);
                    System.out.println("Decrement: "+count.value());

                }

            }


        };



        t1.start();
        t2.start();


       /* try{
            t1.join();
            t2.join();
        }catch(InterruptedException ie){}
        */


        System.out.println("Final value of Count is:  "+count.value());


    }

}
