/**
 * This class contains methods for finding shortest paths using Bellman-Ford algorithm
 * DAA-E8
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

public class BellmanFordPaths {
    void shortestPath(int[][] G, int[] dist, int vertices) {
        int[] prev = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            prev[i] = -1;
        }

        for (int i = 0; i < vertices - 1; i++) {
            for (int u = 0; u < vertices; u++) {
                for (int v = 0; v < vertices; v++) {
                    if (dist[u] != Integer.MAX_VALUE / 2 && (dist[u] + G[u][v]) < dist[v]) {
                        dist[v] = dist[u] + G[u][v];
                        prev[v] = u; //updating predecessor of v
                    }
                }
            }
        }

        //check for negative cycles
        for (int u = 0; u < vertices; ++u) {
            for (int v = 0; v < vertices; ++v) {
                if (dist[u] != Integer.MAX_VALUE / 2 && dist[u] + G[u][v] < dist[v]) {
                    System.out.println("Graph contains negative weight cycle!");
                    return;
                }
            }
        }

        //display the shortest distances
        System.out.println("\n> SHORTEST DISTANCES from source:\nVertex\t\tDistance\tPath");
        for (int i = 0; i < vertices; ++i) {
            System.out.print(i + "\t\t\t" + dist[i] + "\t\t\t");
            printPath(prev, i);
            System.out.println();
        }
    }

    void printPath(int[] pred, int v) {
        if (v == 0) {
            System.out.print(v);
        } else if (pred[v] == -1) {
            System.out.print("No path");
        } else {
            printPath(pred, pred[v]);
            System.out.print(" -> " + v);
        }
    }

    public static void main(String[] args) {
        BellmanFordPaths ob = new BellmanFordPaths();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        int[][] G = new int[v][v];
        int[] dist = new int[v];
        int max = Integer.MAX_VALUE / 2;


        System.out.print("\n>>Input Adjacency Matrix<<");
        for (int i = 0; i < v; i++) {
            System.out.println("\nEnter adjacency value for vertex " + (i + 1) + ":");
            for (int j = 0; j < v; j++) {
                int input = sc.nextInt();
                if (input == 0)
                    G[i][j] = max;
                else
                    G[i][j] = input;
            }
            //initializing distance matrix
            if (i == 0)
                dist[i] = 0;
            else
                dist[i] = max;

        }
        ob.shortestPath(G, dist, v);
    }
}
