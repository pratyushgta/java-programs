/**
 * This class contains methods to implement Election Algorithm using Bully’s method
 * DC-E5
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6.DC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Process {
    int id;
    boolean active;

    public Process(int id, boolean status) {
        this.id = id;
        this.active = status;
    }

    public void deactivate() {
        this.active = false;
    }

    public void activate() {
        this.active = true;
    }

    public int getId() {
        return this.id;
    }

}

public class ElectionAlgorithm {
    List<Process> processes;
    int tot_process;
    Process coordinator, failed;

    public ElectionAlgorithm(int tot_process, int start, int failed) {
        this.tot_process = tot_process;
        this.processes = new ArrayList<>();

        for (int i = 1; i <= tot_process; i++) {
            processes.add(new Process(i, true));
        }

        this.coordinator = processes.get(start - 1);
        this.failed = processes.get(failed - 1);

    }

    public void electCoordinator() {
        List<Process> receivedOK = new ArrayList<>();
        System.out.println("Current coordinator: " + coordinator.getId());

        failed.deactivate();
        System.out.println(failed.getId() + " failed");

        int current = coordinator.getId();

        while (current < tot_process) {
            for (int i = current + 1; i <= tot_process; i++) {
                if (processes.get(current - 1).active)
                    System.out.println(processes.get(current - 1).getId() + " sends election to " + processes.get(i - 1).getId());
            }

            for (int i = current + 1; i <= tot_process; i++) {
                if (processes.get(i - 1).active) {
                    if (processes.get(current - 1).active) {
                        System.out.println(processes.get(i - 1).getId() + " sends OK to " + processes.get(current - 1).getId());
                        receivedOK.add(processes.get(i - 1));
                    }
                } else {
                    System.out.println(processes.get(i - 1).getId() + " failed");
                }
            }
            current++;
        }
        System.out.println(receivedOK.get(receivedOK.size() - 1).getId() + " sends coordinator to all");
        coordinator = receivedOK.get(receivedOK.size() - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total processes: ");
        int total = sc.nextInt();

        System.out.print("Enter the process initiated election: ");
        int s_node = sc.nextInt();

        System.out.print("Enter the process that failed: ");
        int f_node = sc.nextInt();

        ElectionAlgorithm ob = new ElectionAlgorithm(total, s_node, f_node);
        ob.electCoordinator();
    }
}

       /*boolean receivedOK = false;

            /*if (current == tot_process - 1 && !processes.get(current + 1).active) {
                System.out.println(processes.get(current).getId() + " sends coordinator to all");
                coordinator = processes.get(current);
                break;
            }

            current++;
            for (int i = current + 1; i <= tot_process; i++) {
                if (processes.get(i - 1).active) {
                    receivedOK = true;
                    break;
                }
            }

            if (!receivedOK) {
                System.out.println(processes.get(current - 1).getId() + " sends coordinator to all");
                coordinator = processes.get(current - 1);
                break;
            }*/