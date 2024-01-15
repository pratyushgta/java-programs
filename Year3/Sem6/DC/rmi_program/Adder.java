/**
 * This class contains abstract method for defining remote interface
 * DC-E3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC.rmi_program;

import java.rmi.*;

public interface Adder extends Remote {
    public int add(int x, int y) throws RemoteException;
}
