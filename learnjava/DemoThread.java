package corejava.learnjava;

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("concurrent thread started running..");
        Thread t = Thread.currentThread();
        t.setName("Sub Thread");
        System.out.println("Thread name is "+t);

        try{

            Thread.sleep(3000);
        } catch( InterruptedException ie){};

        System.out.println("Sub thread terminated");


    }

}

class DemoThread
        {
            public static void main( String args[] )
                    {
                        MyThread mt = new  MyThread();
                        mt.start();

                        Thread t = Thread.currentThread();
                        t.setName("Main Thread");
                        System.out.println("Thread name is "+t);

                        try {
                            mt.join();
                        } catch (InterruptedException ie){

                        }
                        System.out.println("Waitted until sub thread completed");

                    }
        }
