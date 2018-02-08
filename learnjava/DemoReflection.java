package corejava.learnjava;
import java.lang.reflect.*;

public class DemoReflection
{
    public static void main(String args[])
    {
        try
        {
            Class c = Class.forName("java.lang.String"); //must be fully qualified name
            Constructor< StudentRef>[] ct = c.getConstructors();
            for(int i=0; i< ct.length; i++)
            { System.out.println(ct[i]); }
            Constructor< StudentRef>[] cdt = c.getDeclaredConstructors();
            for(int i=0;i< cdt.length;i++)
            { System.out.println(cdt[i]);}

            Method[] mtd = c.getDeclaredMethods();
            for(int i=0;i<mtd.length;i++)
            { System.out.println(mtd[i]);}

            Field[] ftd = c.getDeclaredFields();
            for(int i=0;i<ftd.length;i++)
            { System.out.println(ftd[i]);}

        }
        catch(Exception e)
        { e.printStackTrace();}
    }
}
