package searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class DFS {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public DFS(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int v, int w) {
        adjacencyList.get(v).add(w);
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        visited[startVertex] = true;
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            System.out.print(currentVertex + " ");

            List<Integer> neighbors = adjacencyList.get(currentVertex);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        System.out.println("DFS starting from vertex 0:");
        graph.dfs(0);
    }


}