/**
 * This class contains methods to implement Lamport's Logical Clock Algorithm
 * DC-E7
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class L_process {
    int id, clock; // clock stores local time of each process
    final int inc; // each local clock increments by certain specific time

    public L_process(int id, int clock, int inc) {
        this.id = id;
        this.clock = clock;
        this.inc = inc;
    }

    public void increment_clock() {
        this.clock += inc;
    }

    public int getClock() {
        return this.clock;
    }
}

class L_message {
    int id, from, to, timestamp;
    // from = process that sent the message, to =  process that the message is sent to,
    // timestamp = global time at which process was sent
    boolean active; // checks if the message is being sent

    public L_message(int id, int from, int to, int timestamp) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.timestamp = timestamp;
    }

    // sets true when the message has been sent but not yet received
    public void sent() {
        this.active = true;
    }

    // sets false when the message has been received
    public void received() {
        this.active = false;
    }
}

public class LamportAlgorithm {
    List<L_process> processes; // stores info of all processes
    List<L_message> messages; // stores info of all messages
    int tot_process, tot_messages, global_clock = 0; // stores total number of processes and messages


    void init_process(int tot_process) {
        System.out.println("\n> Input process info");
        Scanner sc = new Scanner(System.in);
        this.tot_process = tot_process;
        processes = new ArrayList<>();
        for (int i = 0; i < tot_process; i++) {
            System.out.print("Process " + i + " increments by: ");
            int p_inc = sc.nextInt();
            processes.add(new L_process(i, 0, p_inc));
        }

    }

    void init_message(int tot_messages) {
        System.out.println("\n> Input message info");
        Scanner sc = new Scanner(System.in);
        this.tot_messages = tot_messages;
        messages = new ArrayList<>();
        for (int i = 0; i < tot_messages; i++) {
            System.out.println("-> Message " + i);
            System.out.print("From process: ");
            int m_from = sc.nextInt();
            System.out.print("To process: ");
            int m_to = sc.nextInt();
            System.out.print("Send at (global timestamp): ");
            int m_ts = sc.nextInt();
            messages.add(new L_message(i, m_from, m_to, m_ts));
            System.out.println();
        }
    }

    void display() {
        System.out.print(global_clock + ": ");
        for (int i = 0; i < tot_process; i++) {
            System.out.print(processes.get(i).getClock() + "  ");
        }
        System.out.println();
    }

    void simulate() {
        int send_time = -1; // stores the local time of process at which it sent the message
        // global clock
        System.out.println("\nMessage passing simulations:");
        display();
        for (global_clock = 1; global_clock <= 10; global_clock++) {
            for (int i = 0; i < tot_process; i++) {
                // increment local clock of each process
                processes.get(i).increment_clock();

                // Handles message receiving
                if (send_time != -1) { // check if a message has already been sent
                    for (int j = 0; j < tot_messages; j++) {
                        // checks if the message was sent in the previous global clock cycle, whether it is active or not, and if the current process is the one for which it was intended
                        if (messages.get(j).timestamp != global_clock && messages.get(j).active && messages.get(j).to == processes.get(i).id) {
                            if (send_time >= processes.get(i).getClock()) // if local clock is behind the time at which the message was sent at
                                processes.get(i).clock = send_time + 1;
                            send_time = -1;
                            messages.get(j).received();
                            System.out.println("Process " + processes.get(i).id + " received message " + messages.get(j).id + " at " + processes.get(i).getClock());
                        }
                    }
                } else {
                    // Handles message sending
                    for (int j = 0; j < tot_messages; j++) {
                        // checks if current process wants to send a message
                        if (messages.get(j).from == processes.get(i).id && messages.get(j).timestamp == global_clock) {
                            System.out.println("Process " + processes.get(i).id + " sends message " + messages.get(j).id + " to Process " + messages.get(j).to);
                            messages.get(j).sent();
                            send_time = processes.get(i).getClock();
                        }
                    }
                }
            }
            display();
        }
    }

    public static void main(String[] args) {
        System.out.println(">>LAMPORT'S ALGORITHM<<");
        Scanner sc = new Scanner(System.in);
        LamportAlgorithm ob = new LamportAlgorithm();

        System.out.print("Enter total processes: ");
        int tot_p = sc.nextInt();

        System.out.print("Enter total messages: ");
        int tot_m = sc.nextInt();

        ob.init_process(tot_p);
        ob.init_message(tot_m);
        ob.simulate();
    }
}


/*     L_message msg = ob.messages.get(j);
                    L_process sender = ob.processes.get(msg.start);
                    L_process receiver = ob.processes.get(msg.end);
                    if (sender.getClock() >= receiver.getClock()) {
                        receiver.clock = sender.getClock() + 1;
                    } else {
                        receiver.clock = Math.max(receiver.getClock(), sender.getClock()) + 1;
                    }*/