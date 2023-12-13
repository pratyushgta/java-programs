/**
 * This class contains methods for implementing First Come, First Served (FCFS) scheduling algorithm
 * OS-E3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year3.Sem5;

import java.util.Scanner;

public class FCFS {

    static void bubble_sort(int[] P, int[] BT, int[] AT) { //p=process bt=butter_time at=arrival_time
        int size = AT.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (AT[j] > AT[j+1]) {
                    int temp_at = AT[j];
                    AT[j] = AT[j+1];
                    AT[j+1] = temp_at;

                    int temp_bt = BT[j];
                    BT[j] = BT[j+1];
                    BT[j+1] = temp_bt;

                    int temp_p = P[j];
                    P[j] = P[j+1];
                    P[j+1] = temp_p;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] P;
        int[] BT;
        int[] AT;
        int[] WT;
        int[] TAT;
        int[] CT;
        int n;

        Scanner sc = new Scanner(System.in);

        //Inputs
        System.out.print("Enter size: ");
        n = sc.nextInt();
        P = new int[n];
        BT = new int[n];
        AT = new int[n];
        WT = new int[n];
        TAT = new int[n];
        CT = new int[n];

        System.out.println("\n>>>>Input BT & AT<<<<\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter BT " + (i + 1) + ": ");
            BT[i] = sc.nextInt();
            System.out.print("Enter AT " + (i + 1) + ": ");
            AT[i] = sc.nextInt();
            System.out.println();
            P[i] = i+1;
        }

        bubble_sort(P,BT,AT);

        System.out.println("Process execution in order: ");
        for(int i=0;i<n;i++) {
            System.out.print(P[i] + " ");
        }
        System.out.println();

        //Calculate Completion Time
        CT[0] = BT[0];
        for(int i=1;i<n;i++){
            CT[i] = CT[i-1] + BT[i];
        }
        //Calculate Turnaround Time
        for(int i=0;i<n;i++){
            TAT[i]=CT[i]-AT[i];
        }
        //Calculate Average Turnaround Time
        double ATAT=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=TAT[i];
        }
        ATAT = sum2/n;
        //Calculate Waiting Time
        for(int i=0;i<n;i++){
            WT[i]=TAT[i]-BT[i];
        }
        //Calculate Await Time
        double AWT=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=WT[i];
        }
        AWT = sum/n;

        //Outputs
        System.out.println("Completion Time:");
        for(int i=0;i<n;i++){
            System.out.print(CT[i]+" ");
        }
        System.out.println();
        System.out.println("Wait Time:");
        for(int i=0;i<n;i++){
            System.out.print(WT[i]+" ");
        }
        System.out.println();
        System.out.println("Turnaround Time:");
        for(int i=0;i<n;i++){
            System.out.print(TAT[i]+" ");
        }
        System.out.println();
        System.out.println("Await Time: "+AWT+"\nAverage Turnaround Time: "+ATAT);
    }
}
