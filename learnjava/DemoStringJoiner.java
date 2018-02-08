package corejava.learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class DemoStringJoiner {

    public static void main(String[] args){

        String[] arr = {"China", "Korea", "Japan", "Mongolia"};

        ArrayList <String> arrList1 = new ArrayList<String>();
        arrList1.add("Singapore");
        arrList1.add("Thailand");
        arrList1.add("Vietnam");
        arrList1.add("Laos");

        ArrayList <String> arrList = new ArrayList <String>(Arrays.asList(arr));
        StringJoiner sj1 = new StringJoiner("---", "@START", "@END");
        StringJoiner sj2 = new StringJoiner("---", "@START", "@END");

        sj1.add("1st").add("2nd").add("3rd");


        for (String i: arrList)
        {
            sj1.add(i);
        }

        for (String j: arrList1)
        {
            sj2.add(j);
        }

        sj1.merge(sj2);
        System.out.println(sj1.toString());

    }


}
