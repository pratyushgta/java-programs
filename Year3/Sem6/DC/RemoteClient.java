/**
 * This class contains client side methods for performing two-way-remote client & server communication
 * DC-E2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year3.Sem6.DC;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class RemoteClient {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("103.152.126.255", 6363);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";
        while (!str.equals("stop")) {
            System.out.print("-> Client says: ");
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            System.out.println(">>Message Sent to server<<");
            str2 = din.readUTF();
            System.out.println("Server said: " + str2);
        }

        dout.close();
        s.close();
    }
}