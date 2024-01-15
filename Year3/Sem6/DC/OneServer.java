/**
 * This class contains server side methods for performing one-way client & server communication
 * DC-E2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class OneServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readUTF();
            System.out.println("message= " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
