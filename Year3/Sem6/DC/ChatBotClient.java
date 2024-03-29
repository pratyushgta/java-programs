/**
 * This class contains client side methods implementing a chatbot that answers client's questions automatically
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

public class ChatBotClient {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 3333);

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";
        while (!str.contains("goodbye")) {
            System.out.print("-> Client says: ");
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2 = din.readUTF();
            System.out.println("Server said: " + str2);
        }

        dout.close();
        s.close();
    }
}
