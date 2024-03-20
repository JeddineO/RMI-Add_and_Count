package Server;

import Service.ServiceImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {


    public static void main(String args[])
    {
        try {
            LocateRegistry.createRegistry(1099);
            ServiceImpl ob=new ServiceImpl();
            Naming.rebind("rmi://localhost:1099/cv",ob);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
