/**
 * This class contains client side methods for performing one-way client & server communication
 * DC-E2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC;

import java.io.DataOutputStream;
import java.net.Socket;

public class OneClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6363);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello world o.O");
            dout.flush();
            dout.close();
            s.close();
            System.out.println(">>Message sent<<");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
