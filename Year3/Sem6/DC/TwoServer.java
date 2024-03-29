/**
 * This class contains server side methods for performing two-way client & server communication
 * DC-E2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TwoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6363);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";
        while (!str.equals("stop")) {
            str = din.readUTF();
            System.out.println("Client said: " + str);
            System.out.print("-> Server says: ");
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
            System.out.println(">>Message Sent to client<<");
        }
        din.close();
        s.close();
        ss.close();
    }
}
