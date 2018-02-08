package corejava.com.company;

import java.util.*;

public class DemoArrays {

    public static void main(String[] args){

        Integer[] arr = {1,5,6,7,10,26,3,9};

        ArrayList <Integer> list1 =  new ArrayList <Integer>();


        //below statement will not work if with
        //        int[] arr = {1,5,6,7,10,26,3,9};
        //because a primitive type can't replace a generic type parameter.

        list1.addAll(Arrays.asList(arr));

        int[] arr1 = {1,5,6,7,10,26,3,9};
        Arrays.sort(arr);
        Arrays.sort(arr1);

        int index= Arrays.binarySearch(arr, 9);
        int hashCode1=Arrays.hashCode(arr);
        int hashCode2=Arrays.hashCode(arr1);

        System.out.println(Arrays.toString(Arrays.copyOf(arr, 5)));
        //binarySearch就是二分排序搜索法
        System.out.println(list1.toString());
        System.out.println(list1);

        Arrays.fill(arr1,2,4, 0);
        System.out.println(Arrays.toString(arr1));
        System.out.println(index);
        System.out.println(hashCode1);
        System.out.println(hashCode2);



    }
}
