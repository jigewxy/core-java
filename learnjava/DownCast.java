package learnjava;

class Parent{ }

public class DownCast extends Parent
{
    public void check()
    {
        System.out.println("Sucessfull Casting");
    }

    public static void show(Parent p)
    {
        if(p instanceof DownCast)
        {
            DownCast b1=(DownCast)p;
            b1.check();
        }
    }

    public static void main(String[] args)
    {

        Parent p=new DownCast();

        DownCast.show(p);

    }
}
