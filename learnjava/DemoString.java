package corejava.learnjava;

import java.util.regex.Pattern;
import java.util.Arrays;

class DemoString {
    public static void main(String args[])
    {
        String str = "study";
        str.concat("tonight");
        System.out.println(str);      // Output: study

        String str2 = "Hello World";
        System.out.println(str2.substring(0,5));
        System.out.println(str2.replace("Hello", "Hi"));
        String[] strArr = str2.split(Pattern.quote(" "));

        System.out.println(String.valueOf(100));  //converting integer to string.
        System.out.println(Arrays.toString(strArr));  // this is the standard way of print an array of strings


        int[] x = {1,2,3,4,5,5,6,7,8,9};
        char[] x1 ={'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(x));
       // String y = String.join("",x1);

        /**  int[] x;
         * x= new int[] { 1,2,3,....}*/

        StringBuffer strB = new StringBuffer("study");
        strB.append("tonight");
        strB.append("Just exceed the StringBuffer capacity");
        System.out.println(strB);
        System.out.println(strB.capacity());
        strB.replace(5,8, " replacement ");
        System.out.println(strB);

        // Output: studytonight
    }
}