package Year3.Sem6.DC;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote {
    public int add(int x, int y) throws RemoteException;
}

