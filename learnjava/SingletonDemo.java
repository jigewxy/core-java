package learnjava;

class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){};

    public static Singleton getInstance(){

        return singleton;
    }

    protected static void demoMethod(){

        System.out.println("Demo method for Singleton");
    }

}

public class SingletonDemo{

    public static void main(String[] args){
        Singleton sing = Singleton.getInstance();
        sing.demoMethod();
    }

}


