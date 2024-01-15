/**
 * This class contains methods for client application
 * DC-E3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC.rmi_program;

import java.rmi.Naming;

public class RMI_Client {
    public static void main(String args[]) {
        try {
            Adder stub = (Adder) Naming.lookup("rmi://localhost:1900" + "/pratyush");
            System.out.println("Addition answer: " + stub.add(59, 4));
        } catch (Exception e) {
        }
    }
}
