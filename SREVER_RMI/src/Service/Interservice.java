package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interservice extends Remote {

    public int addchif(int n) throws RemoteException;
    public int counter(char c,String str) throws RemoteException;
}
