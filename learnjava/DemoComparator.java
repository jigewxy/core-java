package corejava.learnjava;

import java.util.*;

class Student {
    Integer id;
    String name;

    public Student(Integer id, String name){

        this.id= id;
        this.name = name;

    }

    @Override
    public String toString(){

        return this.id + ": " + this.name;

    }

}

class MyComparator implements Comparator<Student> {

    @Override
    public int compare (Student s1, Student s2){

       return s1.id - s2.id;
    }

}


class MyComparatorReversed implements Comparator<Student> {

    @Override
    public int compare (Student s1, Student s2){

        return s2.id - s1.id;
    }

}

public class DemoComparator {

    public static void main (String[] args){

        ArrayList grp1 = new ArrayList();

      //  Iterator <Student> it1 = grp1.iterator();  NOTE that iterator need to be declared later.

        grp1.add(new Student(1, "Cliff"));
        grp1.add(new Student(5, "Paul"));
        grp1.add(new Student(10, "Andy"));
        grp1.add(new Student(7, "Sniper"));
        grp1.add(new Student(8, "Feeder"));
        grp1.add(new Student(20, "God"));

        grp1.sort(new MyComparator());
        System.out.println(grp1);

        Iterator <Student> it1 = grp1.iterator();

        while (it1.hasNext())
        {
           // Student x = it1.next();
            System.out.println(it1.next());

        }

        System.out.println(grp1.size());



        TreeSet grp2 = new TreeSet(new MyComparatorReversed());   //NOTE the comparator need to be included in the constructor for TreeSet.
        grp2.add(new Student(1, "Cliff"));
        grp2.add(new Student(5, "Paul"));
        grp2.add(new Student(10, "Andy"));
        grp2.add(new Student(7, "Sniper"));
        grp2.add(new Student(8, "Feeder"));
        grp2.add(new Student(20, "God"));

        System.out.println(grp2);

    }


}