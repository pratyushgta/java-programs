package Year3.Sem6.DC;

import Year2.Add;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {
    AdderRemote() throws RemoteException {
        super();
    }

    public int add(int x, int y) {
        return x + y;
    }
}
