import java.util.ArrayList;
import learnjava.*;

public class Fibbon {

    public static int calculateFibon(int n){

        if (n==0)
        {
            return 0;
        }
        else if (n==1)
        {
            return 1;
        }
        else
                return calculateFibon(n-1)+calculateFibon(n-2);

}

    public static void main(String[] args){

        ArrayList <Integer> result = new ArrayList<Integer> ();

        Dog mydog = new Dog("Labrado", "hero");

        mydog.speak();
        mydog.showDetails();


        for (int i=0; i<=10;i++)
        {

            result.add(calculateFibon(i));
        }

        System.out.println(result);


    }
}
