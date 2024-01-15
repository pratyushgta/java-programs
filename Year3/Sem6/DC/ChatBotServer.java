/**
 * This class contains server side methods implementing a chatbot that answers client's questions automatically
 * DC-E2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ChatBotServer {
    public static void main(String[] args) throws IOException {
        ChatBotServer ob = new ChatBotServer();
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        String str = "", str2 = "";
        while (!str.equals("stop")) {
            str = din.readUTF();
            System.out.println("Client said: " + str);
            str2 = ob.reply(str);
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }

    String reply(String msg) {
        String reply_msg = null;
        if (msg.equalsIgnoreCase("Hello") || msg.equalsIgnoreCase("hi")) {
            Random rand = new Random();
            String[] hello = {"Buna ziua", "hallo", "Përshëndetje", "ሰላም", "Բարեւ Ձեզ", "Salam", "হ্যালো", "kaixo", "добры дзень", "zdravo", "Здравейте", "မင်္ဂလာပါ", "Hola", "kumusta", "你好", "你好", "Bonghjornu", "zdravo", "Hej", "Hallo", "Hello", "Henlo"};
            int random;
            random = rand.nextInt(50);
            while (random > hello.length) {
                random = rand.nextInt(50);
            }
            reply_msg = hello[random] + "!";
        } else if (msg.equalsIgnoreCase("how are you") || msg.equalsIgnoreCase("howdy")) {
            reply_msg = "I'm good!";
        } else if (msg.equalsIgnoreCase("goodbye") || msg.equalsIgnoreCase("bye")) {
            reply_msg = "See you soon!";
        } else {
            reply_msg = "hmm";
        }
        return reply_msg;
    }
}
