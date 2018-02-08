package learnjdbc;

import java.sql.*;
import java.util.*;

public class DemoInsertSql
{
    public static void main(String []args)
    {
        HashMap <Integer, String> students = new HashMap<>();

        students.put(106,"Cliff");
        students.put(107, "Kiran");
        students.put(108, "Trump");


        Set <Map.Entry<Integer, String>> x  = students.entrySet();



        try{
//Loading driver
            Class.forName("com.mysql.jdbc.Driver");

//creating connection
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/test","admin","");

            for (Map.Entry z: x)
            {
                PreparedStatement ps = con.prepareStatement ("insert into student values(?,?)");	//executing statement

                ps.setInt(1, (Integer)z.getKey());
                ps.setString(2, (String)z.getValue());

                ps.executeUpdate();
            }


            con.close();	//closing connection
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
