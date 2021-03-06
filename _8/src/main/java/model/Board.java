package model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Board {

    private final Graph complete;

    public Board(int n) {

        List<Edge> edges = new LinkedList<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                edges.add(new Edge(i, j));
            }
        }

        Collections.shuffle(edges);
        complete = new Graph(edges);

    }

    public synchronized Edge extract() {

        Edge edge = complete.pullFirst();
        return edge;
    }

    public boolean isEmpty() {

        return complete.isEmpty();

    }

}
