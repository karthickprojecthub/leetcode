package searching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSearch {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjacencyList;

    public BFSearch(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            this.adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int v, int w) {
        this.adjacencyList.get(v).add(w);
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int neighbor : adjacencyList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }


    public static void main(String[] args) {
        BFSearch graph = new BFSearch(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        System.out.println("BFS starting from vertex 0:");
        graph.bfs(0);
    }
}
