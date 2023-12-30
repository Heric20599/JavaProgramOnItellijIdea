package GRAPH;

import java.util.ArrayList;

public class GraphAdjacencylist {
    public static void addedge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);

    }
    public static void printgraph(ArrayList<ArrayList<Integer>>adj){
        for (int i = 0; i <adj.size() ; i++) {
            for (int j = 0; j <adj.get(i).size() ; j++) {
                System.out.print(adj.get(i).get(j));
            }
            System.out.println();
            
        }

    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(5);
        for (int i = 0; i<v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addedge(adj,0,1);
        addedge(adj,0,2);
        addedge(adj,1,2);
        addedge(adj,2,3);
        printgraph(adj);
    }
}
