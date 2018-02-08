package corejava.LearnJavaio;
import java.io.*;

public class DemoReadLine {

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
           // int c1 = br.read();
           // char c1 = (char) br.read();   // br.read() return INT type(unicode)
            String str = (String) br.readLine(); //br.readLine() return String type;
            System.out.println(str);

        }catch(IOException ie){};




    }

}
