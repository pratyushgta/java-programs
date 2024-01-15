/**
 * This class contains methods for implementing remote interface
 * DC-E3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC.rmi_program;

import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder {
    AdderRemote() throws RemoteException {
        super();
    }

    public int add(int x, int y) {
        return x + y;
    }
}
