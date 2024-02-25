/**
 * This class contains server side methods for implementing calculator using socket programming
 * DC-E6
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC.socket_calc;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class socket_server {
    public static void main(String[] args) throws IOException {
        socket_server ob = new socket_server();
        ServerSocket ss = new ServerSocket(6363);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        String str = "", str2 = "";
        while (!str.contains("goodbye")) {
            str = din.readUTF();
            System.out.println("\nClient said: " + str);
            if (str.split(" ").length != 3) {
                str2 = "Invalid input format. Input format: num1 <operator> num2";
            } else {
                str2 = ob.calculate(str);
                if (str2 == null)
                    str2 = "Invalid Input";
            }
            System.out.print("-> Server says: " + str2 + " " + str.length());
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }

    String calculate(String str) {
        String[] input = str.split(" ");
        if (input[1].equalsIgnoreCase("+")) {
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[2]);
            return String.valueOf(num1 + num2);
        } else if (input[1].equalsIgnoreCase("-")) {
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[2]);
            return String.valueOf(num1 - num2);
        } else if (input[1].equalsIgnoreCase("*") || input[1].equalsIgnoreCase("x")) {
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[2]);
            return String.valueOf(num1 * num2);
        } else if (input[1].equalsIgnoreCase("/")) {
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[2]);
            return String.valueOf(num1 / num2);
        } else return null;
    }
}

