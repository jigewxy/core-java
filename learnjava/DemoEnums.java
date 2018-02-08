package corejava.learnjava;


enum WeekDays
{ sun, mon, tues, wed, thurs, fri, sat }


public class DemoEnums {

    public static void main(String args[])
    {
        WeekDays wk; //wk is an enumeration variable of type WeekDays
        WeekDays wk1 = WeekDays.thurs;
        wk = WeekDays.sun; //wk can be assigned only the constants defined under enum type Weekdays
        System.out.println("Today is "+wk);
        System.out.println("Tomorrow is "+wk1);


        WeekDays[] wkArr = WeekDays.values();

        for(WeekDays i: wkArr)
        {
            System.out.println(i);
            System.out.println(i.getClass());

        }
    }
}
