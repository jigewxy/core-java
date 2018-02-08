package learnjava;

import java.util.*;

public class DemoHashMap {

        public static void main(String args[])
        {
            HashMap< String,Integer> hm = new HashMap< String,Integer>();
            hm.put("a",new Integer(100));
            hm.put("b",new Integer(200));
            hm.put("c",new Integer(300));
            hm.put("d",new Integer(400));

            System.out.println(hm.get("a"));


           Set<String> ks = hm.keySet();
           Set <Map.Entry <String, Integer>> st = hm.entrySet();


            for(String i: ks){

                System.out.print(i+":");
                System.out.println(hm.get(i));

            }

            for (Map.Entry j:st){

                System.out.print(j.getKey() +":");
                System.out.println(j.getValue());

            }

            // keySet  return set
            // entrySet return Map.Entry
            // getKey(Map.Entry)
            //getValue(Map.Entry)
            //HashMap.get(Key)
            //HashMap.put(Key, Value)

          /*  Set< Map.Entry< String,Integer> > st = hm.entrySet();    //returns Set view
            for(Map.Entry< String,Integer> me:st)
            {
                System.out.print(me.getKey()+":");
                System.out.println(me.getValue());
            } */
        }
}
