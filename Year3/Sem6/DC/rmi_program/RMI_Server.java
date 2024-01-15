/**
 * This class contains methods for server application that hosts RMI services
 * DC-E3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC.rmi_program;

import java.rmi.*;
import java.rmi.registry.*;

public class RMI_Server {
    public static void main(String args[]) {
        try {
            Adder stub = new AdderRemote();
            LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900" + "/pratyush", stub);
            System.out.println("Server is good to go!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
