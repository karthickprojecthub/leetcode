package searching;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Bfs {

    private int v;

    private ArrayList<Integer> adj[];

    Bfs(int n){
        v= n;
        adj = new ArrayList[v];

        for(int i=0; i < v; i++){
            adj[i] = new ArrayList<>();
        }
    }

    void bfsMethod(int s){
        boolean visited[] = new boolean[v];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0){
            s = queue.poll();
            System.out.println(s +" ");
            Iterator<Integer> i = adj[s].listIterator();

            while(i.hasNext()){
                int n = i.next();

                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    public static void main(String[] args) {
        Bfs bfs = new Bfs(18);
//        bfs.addEdge(0,1);
//        bfs.addEdge(0,2);
//        bfs.addEdge(1,2);
//        bfs.addEdge(2,0);
//        bfs.addEdge(2,3);
//        bfs.addEdge(3,3);

        bfs.addEdge(0,1);
        bfs.addEdge(0,2);
        bfs.addEdge(1,3);
        bfs.addEdge(1,4);
        bfs.addEdge(2,5);
        bfs.addEdge(5,6);
        bfs.addEdge(5,7);
        bfs.addEdge(0,13);
        bfs.addEdge(3,17);

        bfs.bfsMethod(2);





    }




}
