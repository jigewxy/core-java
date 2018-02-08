package corejava.learnjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mongodb.*;



public class DemoJdbc
{
    public static void main(String []args)
    {
        try{
//Loading driver
            Class.forName("com.mysql.jdbc.Driver");

//creating connection
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/test","admin","");

          /*  Statement s = con.createStatement();	//creating statement

            ResultSet rs = s.executeQuery("select * from student");	//executing statement
            */

          PreparedStatement ps = con.prepareStatement("SELECT * FROM student");

          ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

            con.close();	//closing connection
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}