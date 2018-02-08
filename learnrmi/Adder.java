package learnrmi;

import java.rmi.*;
import java.rmi.server.*;
public class Adder extends UnicastRemoteObject implements AddServerInterface
{
    Adder()throws RemoteException{
        super();
    }
    public int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String args[]){
        try{
            AddServerInterface addService=new Adder();
            Naming.rebind("AddService",addService);
//addService object is hosted with name AddService.

        }catch(Exception e){System.out.println(e);}
    }
}
