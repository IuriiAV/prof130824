package com.telran.lesson14;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<List<Integer>> adjacencyList = new ArrayList<>();

    private List<Edge> edges;

    public Graph(List<Edge> edges) {
        this.edges = edges;
    }

    private void generateAdjacencyList(){
        int vertex = 0;
        for (Edge edge : edges){
            vertex = Math.max(vertex,Math.max(edge.getDestination(), edge.getSource()));
        }
        System.out.println("Max vertex " + vertex);
    }
}
