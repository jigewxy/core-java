package learnjava;

import java.util.*;

class Customer {

    private int id;
    private String name;

    public Customer(int id, String name){

        this.id= id;
        this.name = name;

    }


    public int getId() {

        return this.id;

    }

    public String getName(){


        return this.name;
    }


}


public class DemoPriorityQueue {

    public static void main(String[] args){

      Queue<Integer> integerPriorityQueue  = new PriorityQueue <Integer>();
      Queue<Customer> customerPriorityQueue = new PriorityQueue <Customer>(new idComparator());

      Random rand = new Random();

        for(int i=1;i<=7; i++)
        {
            integerPriorityQueue.add(rand.nextInt(100));
        }

        for(int i=1;i<=7; i++)
        {
            System.out.println(integerPriorityQueue.poll());
        }


          addToPriorityQueue(customerPriorityQueue);
             pollDataFromQueue(customerPriorityQueue);

    }


    public static void addToPriorityQueue(Queue x){

        Random rand = new Random();

        for(int i=0; i<=7; i++){

            x.add(new Customer(rand.nextInt(100), "Cliff"));

        }

    }



    private static class idComparator implements Comparator <Customer> {

        @Override
        public int compare(Customer c1, Customer c2) {
            return (int) (c1.getId() - c2.getId());
        }

    }


    //Comparator anonymous class implementation
   /* public static Comparator idComparator = new Comparator <Customer>(){

        //@Override
        public int compare(Customer c1, Customer c2) {
            return (int) (c1.getId() - c2.getId());
        }
    }; */



    public static void pollDataFromQueue(Queue<Customer> q){

        while(true){

            Customer cust = q.poll();
            if(cust==null) break;
            System.out.println("Processing Customer with ID="+cust.getId());
        }

    }



}
