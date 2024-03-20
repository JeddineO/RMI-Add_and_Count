package Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImpl extends UnicastRemoteObject implements Interservice {
    public ServiceImpl() throws RemoteException {
    }

    @Override
    public int addchif(int n) throws RemoteException {
        int sum=0;
        while (n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }

    @Override
    public int counter(char c, String str) throws RemoteException {
        int cpt=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
                cpt++;
        }
        return cpt;
    }
}
