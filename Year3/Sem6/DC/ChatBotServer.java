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
        while (!str.contains("goodbye")) {
            str = din.readUTF();
            System.out.println("\nClient said: " + str);
            str2 = ob.reply(str);
            System.out.print("-> Server says: " + str2);
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }

    String reply(String msg) {
        String reply_msg = null;
        if (msg.contains("hello") || msg.equalsIgnoreCase("hi")) {
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
        } else if (msg.contains("goodbye") || msg.equalsIgnoreCase("bye")) {
            reply_msg = "See you soon!";
        } else if (msg.equalsIgnoreCase("are you a robot")) {
            reply_msg = "huh? heh, surely not! beep boop";
        } else if (msg.equalsIgnoreCase("what color is the sky")) {
            reply_msg = "Ay, mi amor; ay, mi amor";
        } else {
            reply_msg = "hmm";
        }
        return reply_msg;
    }
}
