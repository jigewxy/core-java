package corejava.learnjava;

import java.util.*;

class Publication {
    private int id;
    private String title;

    // Constructor
    public Publication(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return id + ": " + title;
    }

    // Two book are equal if they have the same id
  //  @Override
    public boolean equals(Object o) {
        if (!(o instanceof Publication)) {
            return false;
        }
        return this.id == ((Publication)o).id;
    }

    // Consistent with equals(). Two objects which are equal have the same hash code.
    @Override
    public int hashCode() {
        return id;
    }
}

public class DemoHashSet {
    public static void main(String[] args) {
        Publication book1 = new Publication(1, "Java for Dummies");
        Publication book1Dup = new Publication(1, "Java for the Dummies"); // same id as above
        Publication book2 = new Publication(2, "Java for more Dummies");
        Publication book3 = new Publication(3, "more Java for more Dummies");

        Set<Publication> set1 = new HashSet<Publication>();
        set1.add(book1);
        set1.add(book1Dup); // duplicate id, not added
        set1.add(book1);    // added twice, not added
        set1.add(book3);
        set1.add(null);     // Set can contain a null
        set1.add(null);     // but no duplicate
        set1.add(book2);
        System.out.println(set1); // [null, 1: Java for Dummies,
        //  2: Java for more Dummies, 3: more Java for more Dummies]

        Iterator x = set1.iterator();

        while(x.hasNext()== true) {
            System.out.println("Iterating");
            System.out.println(x.next());
        }

        set1.remove(book1);
        set1.remove(book3);
        System.out.println(set1); // [null, 2: Java for more Dummies]

        Set<Publication> set2 = new HashSet<Publication>();
        set2.add(book3);
        System.out.println(set2); // [3: more Java for more Dummies]
        set2.addAll(set1);        // "union" with set1
        System.out.println(set2); // [null, 2: Java for more Dummies, 3: more Java for more Dummies]

        set2.remove(null);
        System.out.println(set2); // [2: Java for more Dummies, 3: more Java for more Dummies]
        set2.retainAll(set1);     // "intersection" with set1
        System.out.println(set2); // [2: Java for more Dummies]


        Set <Object> set3 = new HashSet<Object>();

        set3.add(1);
        set3.add('a');
        set3.add("Gogogo");

        Iterator y = set3.iterator();

        while(y.hasNext())
        {
            Object z= y.next();
            if(z instanceof Integer) {
                System.out.println("Integer detected");
                System.out.println(z);
            }

        }

        System.out.println(set3);

        ArrayList<String> l1 = new ArrayList<String>();


        LinkedList <String> ll = new LinkedList<String>();
        ll.add("a");
        ll.addLast("B");
        ll.add("c");
        ll.pop();
        ll.poll();
        System.out.println(ll);
    }
}

