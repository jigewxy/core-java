package learnjava;

class Person{


}

class Place{


}

public class DeadLock {



    public static void main(String[] args){

        final Person p1 = new Person();
        final Place p2 = new Place();

        Thread t1 = new Thread(){

            public void run(){

                synchronized (p1){

                    System.out.println("P1 is locked");

                    try{
                        Thread.sleep(500);
                     } catch (InterruptedException ie)  {}

                    synchronized(p2){
                        System.out.println("t1 has unlocked p2");

                    }

                }

            }

        };

        Thread t2 = new Thread(){

            public void run(){

                synchronized (p2){

                    System.out.println("P2 is locked");

                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException ie)  {}

                    synchronized(p1){
                        System.out.println("t2 has unlocked p1");

                    }

                }



            }

        };

        t1.start();
        t2.start();


    }
}
