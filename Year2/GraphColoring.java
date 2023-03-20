/**
 * These classes contain methods for implementing m-coloring problem using Backtracking algorithm
 * DAA-E10
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;
import java.util.*;

public class GraphColoring {
    private int[][] graph;
    private int numVertices;
    private int numColors;
    private int[] colors;

    public GraphColoring(int[][] graph, int numColors) {
        this.graph = graph;
        this.numVertices = graph.length;
        this.numColors = numColors;
        this.colors = new int[numVertices];
    }

    private boolean color(int vertex) {
        if (vertex == numVertices) {
            return true;
        }

        for (int color = 1; color <= numColors; color++) {
            if (isSafe(vertex, color)) {
                colors[vertex] = color;
                if (color(vertex + 1)) {
                    return true;
                }
                // backtrack
                colors[vertex] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int vertex, int color) {
        for (int i = 0; i < numVertices; i++) {
            if (graph[vertex][i] == 1 && color == colors[i]) {
                return false;
            }
        }
        return true;
    }

    public void solve() {
        if (color(0)) {
            System.out.println("Solution exists. The color configuration is:");
            for (int i = 0; i < numVertices; i++) {
                System.out.print(colors[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Solution does not exist.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of colors: ");
        int numColors = sc.nextInt();

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        int[][] graph = new int[v][v];

        System.out.print("\n>>Input Adjacency Matrix<<");
        for (int i = 0; i < v; i++) {
            System.out.println("\nEnter adjacency value for vertex " + (i + 1) + ":");
            for (int j = 0; j < v; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        GraphColoring ob = new GraphColoring(graph, numColors);
        ob.solve();
    }
}

