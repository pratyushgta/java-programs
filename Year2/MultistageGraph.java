/**
 * This class contains methods for finding Minimum Cost Path for Multistage Graph
 * by backward & forward approaches using Dynamic Programming.
 * DAA-E7
 * @author Shourya Gupta
 * @author Pratyush Kumar (github.com/pratyushgta)
 *
 */

package Year2;

import java.util.Scanner;

public class MultistageGraph {
    public static int forwardApproach(int[][] G, int vertices) {
        int[] cost = new int[vertices];
        cost[vertices - 1] = 0;
        int max = Integer.MAX_VALUE;

        for (int i = vertices - 2; i >= 0; i--) {
            cost[i] = max;
            for (int j = i; j < vertices; j++) {
                if (G[i][j] == max) {
                    continue;
                }
                cost[i] = Math.min(cost[i], (cost[j] + G[i][j]));
            }

        }
        return cost[0];
    }

    public static int backwardApproach(int[][] G, int vertices) {
        int[] cost = new int[vertices];
        cost[0] = 0;
        int max = Integer.MAX_VALUE;

        for (int i = 1; i < vertices; i++) {
            cost[i] = max;
            for (int j = 0; j < i; j++) {
                if (G[j][i] == max) {
                    continue;
                }
                cost[i] = Math.min(cost[i], (cost[j] + G[j][i]));
            }

        }
        return cost[vertices - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        int[][] G = new int[v][v];

        System.out.print("\n>>Input Adjacency Matrix<<");
        for (int i = 0; i < v; i++) {
            System.out.println("\nEnter adjacency value for vertex " + (i + 1) + ":");
            for (int j = 0; j < v; j++) {
                G[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter costs for vertices: ");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (G[i][j] == 0) {
                    G[i][j] = Integer.MAX_VALUE;
                } else {
                    System.out.print((i + 1) + " to " + (j + 1) + ": ");
                    G[i][j] = sc.nextInt();
                }
            }
        }
        System.out.println("\nMinimum cost path by Forward Approach is: " + forwardApproach(G, v));
        System.out.println("\nMinimum cost path by Backward Approach is: " + backwardApproach(G, v));

    }
}
