package Client;

import Service.Interservice;

import java.rmi.Naming;


public class Client {

    public static void main(String args[])
    {
        try {
            Interservice stub=(Interservice) Naming.lookup("rmi://localhost:1099/cv");
            System.out.println("La somme des chiffres 123 est : "+stub.addchif(123));
            System.out.println("La phrase \"Hello World\" contient la caractère l : "+stub.counter('l',"Hello World")+" fois");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
