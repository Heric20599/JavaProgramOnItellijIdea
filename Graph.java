package GRAPH;

import java.util.ArrayList;

public class Graph {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>Graph[]=new ArrayList[v];
        creategraph(Graph);
        // 2's neighbour print
        for (int i = 0; i < Graph[2].size(); i++) {
            Edge e=Graph[2].get(i);
            System.out.print(e.w+" ");
        }
    }

    public static void creategraph(ArrayList<Edge>Graph[]){
        for (int i = 0; i < Graph.length; i++) {
            Graph[i]=new ArrayList<Edge>();
        }
        Graph[0].add(new Edge(0,2,2));
        Graph[1].add(new Edge(1,2,10));
        Graph[1].add(new Edge(1,3,0));
        Graph[2].add(new Edge(2,0,2));
        Graph[2].add(new Edge(2,1,10));
        Graph[2].add(new Edge(2,3,-1));
        Graph[3].add(new Edge(3,1,0));
        Graph[3].add(new Edge(3,2,-1));



    }
    static class Edge{
        int src;
        int des;
        int w;
        public Edge(int s,int d,int w){
            this.des=d;
            this.src=s;
            this.w=w;

        }
    }
}
