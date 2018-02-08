package corejava.LearnJavaio;
import java.io.*;

public class DemoWriteFile {

    public static void main(String[] args){

        try {
            File file = new File("c:/java_io/testfile.txt");

            if (file.createNewFile()) {
                System.out.println("File has been created");
            } else {
                System.out.println("File name already exist");
            }

            String str = "Welcome to this Java Course \n Welcome to this C++ Course \n Welcome to this JS Course \n Welcome to this Python Course \n ";
            FileWriter bf = new FileWriter(file);

            bf.write(str);
            bf.close();

            System.out.println("Write completed, now Read");

             FileReader rf = new FileReader(file);
             BufferedReader brf = new BufferedReader(rf);
             StringBuffer cont = new StringBuffer();

            while(brf.ready()) {   // ready() to check if the BufferedReader is empty or not.
                cont.append(brf.readLine());
            }
            System.out.println(cont);


        } catch (IOException ie){}



    }
}
