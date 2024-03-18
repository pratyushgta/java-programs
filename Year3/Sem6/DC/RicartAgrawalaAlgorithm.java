/**
 * This class contains methods to simulate Distributed Mutual Exclusion using Ricart Agrawala's Algorithm
 * DC-E9
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RA_process {
    int id, timestamp; // timestamp stores time at which process sends requests to enter CR
    public RA_process(int id, int ts) {
        this.id = id;
        this.timestamp = ts;
    }
}

public class RicartAgrawalaAlgorithm {
    int total;
    List<RA_process> processes = new ArrayList<>();
    List<RA_process> CR = new ArrayList<>(); // stores process that wants to enter CR
    List<RA_process> defer = new ArrayList<>(); // stores processes that have been deferred from entering into CR


    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total processes: ");
        total = sc.nextInt();

        System.out.println("> When does the process want to enter CR? ");
        for (int i = 0; i < total; i++) {
            System.out.println("-> Process " + i);
            System.out.print("Enter timestamp [enter 0 if it doesnt want to]: ");
            int ts = sc.nextInt();
            processes.add(new RA_process(i, ts));
        }
    }

    // to handle message passing by process that wants to enter CR
    void sends_req(RA_process sends) {
        for (int i = 0; i < total; i++) {
            System.out.println(" P" + sends.id + " sends request to P" + processes.get(i).id);
        }
    }

    void simulation() {
        int sent_counter = 0; //to keep track of how many processes send request to enter CS
        int global_clock; // keeps track of central system time

        // finding how many processes want to enter CS
        int total_enter = 0;
        for (int i = 0; i < total; i++) {
            if (processes.get(i).timestamp > 0)
                total_enter++;
        }
        System.out.println(total_enter);
        System.out.println("\nMessage passing simulations:");

        // SEND REQUEST
        for (global_clock = 1; global_clock <= 20; global_clock++) {
            System.out.print("ts:" + global_clock + "\n"); // displaying current global time
            for (int i = 0; i < total; i++) {
                if (processes.get(i).timestamp == global_clock) { // if global time matches the time when process wants to send request to enter CR
                    sends_req(processes.get(i));
                    CR.add(processes.get(i));
                    sent_counter++;
                }
            }

            // if all processes that want to enter CR have sent request messages, break the SEND REQUEST process
            if (sent_counter == total_enter)
                break;

        }


        // SEND OK
        global_clock++;
        System.out.print("ts:" + global_clock + "\n"); // displaying current global time
        for (int i = 0; i < total; i++) {
            if (processes.get(i).timestamp == 0) { // if a process doesn't want to enter CR, it sends OK right away
                for (int j = 0; j < CR.size(); j++) {
                    System.out.println(" P" + processes.get(i).id + " sends OK to P" + CR.get(j).id);
                }
            } else if (processes.get(i).timestamp != 0) {
                for (int j = 0; j < CR.size(); j++) { // if process wants to enter CR itself, it compares its timestamp with others that have sent request
                    if (processes.get(i).timestamp < CR.get(j).timestamp) { // if its timestamp is less, defer reply to other processes
                        System.out.println(" P" + processes.get(i).id + " defers reply to P" + CR.get(j).id);
                        defer.add(CR.get(j));
                        CR.remove(CR.get(j));
                    } else {
                        System.out.println(" P" + processes.get(i).id + " sends OK to P" + CR.get(j).id);
                    }
                }
            }
        }

        // ENTER CR
        while (sent_counter > 0) {
            System.out.print("ts:" + global_clock + "\n"); // displaying current global time
            System.out.println(" P" + CR.get(0).id + " enters CR");

            System.out.print("ts:" + global_clock + "\n"); // displaying current global time
            System.out.println(" P" + CR.get(0).id + " exits CR");

            // SEND OK to previously deferred processes
            if (!defer.isEmpty()) {
                System.out.print("ts:" + global_clock + "\n"); // displaying current global time
                for (int i = 0; i < defer.size(); i++) {
                    System.out.println(" P" + CR.get(0).id + " sends OK to P" + defer.get(i).id);
                }
                CR.clear();
                CR.add(defer.get(0));
                defer.remove(defer.get(0));
            }
            sent_counter--;
        }
    }

    public static void main(String[] args) {
        System.out.println(">>> RICART AGRAWALA SIMULATION <<<");
        RicartAgrawalaAlgorithm ob = new RicartAgrawalaAlgorithm();
        ob.input();
        ob.simulation();
    }
}


    /*void sends_ok(int status, RA_process sends) {
        if (status == 0) {
            for (int i = 0; i < total; i++) {
                if (i != sends.id) {
                    System.out.print("\nProcess " + sends.id + " sends OK to P" + processes.get(i).id);
                }
            }
            processes.get(sends.id).process_queue.clear();
        } else if (status == 1) {
            for (int i = 0; i < sends.process_queue.size(); i++) {
                if (sends.timestamp <= processes.get(i).timestamp) {
                    //System.out.println(sends.timestamp + " " + processes.get(i).timestamp);
                    System.out.println(processes.get(i).id + " Added to CR queue");
                    CR.add(sends);
                } else {
                    System.out.print("\nProcess P" + sends.id + " sends OK to P" + processes.get(i).id);
                    defer.add(processes.get(i));
                }
            }
        }

    }*/