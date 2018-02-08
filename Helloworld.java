
import java.util.*;
import java.io.*;

public class Helloworld extends LearnTonight
    {
        // arguments are passed using the text field below this editor
        public static void main(String[] args)
        {

            Helloworld obj = new Helloworld();
            obj.learn();
            System.out.print("my age is "+obj.age + LearnTonight.age);
            LearnTonight.whentolearn();

            ArrayList<Integer> al = new ArrayList<>();

            al.add(5);
            al.add(10);
            al.add(15);
            al.add(20);
            al.add(1,40);

            System.out.println(al);
             /* File f = new File("sample.txt");

            if(f.isFile())
               System.out.println("f is a file");
            else
                System.out.println("f is not a file");
                */

           /*
           int[] numbers = {10,20,30,40,50};
            for(int x:numbers){

                System.out.println(x);
            }
            String[] strs = {"a", "b","c","d"};
            ArrayList<String> strList = new ArrayList <String>(Arrays.asList(strs));
            System.out.println(strList);

            ArrayList temp = new ArrayList();
            temp.add(5);
            temp.add(6);
            temp.add("gogogo");
            System.out.println(temp);

            System.out.println(temp.get(2)); */


        }
    }

    class LearnTonight
    {
        final static int age = 32;
        
        public static void whentolearn(){

            Date date = new Date();

            System.out.println(date.toString());
            System.out.println(date.getTime());
        }
        final void learn()
        {
            System.out.println("let's study tonight");

        }
    }

