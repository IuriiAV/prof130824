package com.telran.lessonGraph1712;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * index 0: 1
 * index 1: 2
 * index 2: 0, 1
 * index 3: 2
 * index 4: 5
 * index 5: 5
 */

public class Graph {

    private List<List<Integer>> adjacenceList = new ArrayList<>();

    private List<Edge> edges;

    public Graph(List<Edge> edges) {
        this.edges = edges;
        generateAdjacencyList();
    }

    private void generateAdjacencyList() {
        int vertex = 0;
        for (Edge edge : edges) {
            vertex = Math.max(vertex, Math.max(edge.getDestination(), edge.getSource()));
        }

        System.out.println("Max vertex " + vertex);
        for (int i = 0; i <= vertex; i++) {
            adjacenceList.add(i, new LinkedList<>());
        }

        for (Edge edge : edges) {
            int index = edge.getSource();
            int value = edge.getDestination();
            List<Integer> integers = adjacenceList.get(index);
            integers.add(value);
        }
    }

    public void print() {
        for (int source = 0; source < adjacenceList.size(); source++) {
            for (int destination : adjacenceList.get(source)) {
                System.out.print("[ " + source + " -> " + destination + " ]");
            }
            System.out.println();
        }
    }
}
