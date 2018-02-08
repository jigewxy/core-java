package corejava.learnjava;

interface Car{
   void speed();
}
public class DemoInnerClass {

    public static void main(String[] args) {
        Outer ot = new Outer();
        Outer.Inner in = ot.new Inner();
        in.show();
        in.speed();
    }
}

class Outer
{
    int count;
    public void display()
    {
        Inner in=new Inner();
        in.show();
    }

    class Inner implements Car
    {
        public void speed()
        {

            System.out.println("Car speed is 100km/h");

        }
        public void show()
        {
            System.out.println("Inside inner "+(++count));
        }
    }
}