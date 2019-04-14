import java.util.*:
import java.io.*;

class Vertex implements Comparable<Vertex> {
    int d;
    int dist;

    Vertex(int d, int dist)
    {
        this.id = id;
        this.dist = dist;
    }

    public String toString() {
        return "Shortest path to vertex" + (char) (id + 'A') + ":" + dist;
    }

    public int compareTo(Vertex rhs)
    {
        return this.dist - rhs.dist
    }

}

public class WeightedGraph {
    int[][] matrix;
    int n;

    final static int oo = (int) 1e9;

    WeightedGraph(String filename) {
        Scanner n = new Scanner(new File(filename));
        n = in.nextInt();

        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
                if (matric[i][j] == -1)
                    matrix[i][j] = oo;
            }
        }

    }

    void runDijkstra(int start)
    {
        int dist[] = new int[n];
        boolean [] visited = new boolean[n];

        Arrays.fill(dist, oo);
        dist[start] = 0;
        PriorityQueue<Vertex> minheap = new PriorityQueue<>();
        minheap.add(new Vertex(start,0));

        int numVisited = 0;

        while(!minheap.isEmpty() && numVisited < n)
        {
            Vertex v = minheap.remove;
            if (visited[v,id])
                continue;
                
                System.out.println(v);
                visited[v,id] = true;

                for (int i = 0; i < n; i++)
                {
                    if((matrix[v.id][i] != 0 && (matrix[v.id] + v.dist) < dist[i]))
                    {
                       dist[i] = matrix[v.id][i] + v.dist;
                       minheap.add(new Vertex(i, dist[i])); 
                    }
                }
        }

        if(numvisited < n)
        System.out.println("Graph is disconnected!");
    }

    public static void main(String[] args) throws Exception {
        WeightedGraph g = new WeightedGraph("dikstra-graph.txt");
        g.runDijkstra(0);
    }
}