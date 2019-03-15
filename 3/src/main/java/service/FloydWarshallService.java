package service;

import graph.Edge;
import graph.Node;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FloydWarshallService {

    private Map<Pair<Node, Node>, Integer> distances = new HashMap<>();


    public void floydWarshall(List<Node> nodes, List<Edge> edges) {

        edges.forEach(edge -> {
            Node source = edge.getStartingNode();
            Node destination = edge.getEndingNode();
            distances.putIfAbsent(new Pair<>(source, destination), edge.getCost());
            if (edge.isTwoWay()) {
                distances.putIfAbsent(new Pair<>(destination, source), edge.getCost());
            }
        });

        nodes.forEach(intermediate -> {
            nodes.forEach(source -> {
                nodes.forEach(destination -> {
                    if (thereAreEdgesBetween(intermediate, source, destination)) {
                        Integer distanceThroughIntermediate = getDistance(intermediate, source) + getDistance(destination, intermediate);
                        Integer directDistance = getDistance(destination, source);
                        if (distanceThroughIntermediate < directDistance) {
                            updateDistance(source, destination, distanceThroughIntermediate);
                        }
                    }
                });
            });
        });
    }

    private void updateDistance(Node source, Node destination, Integer distanceThroughIntermediate) {
        distances.replace(new Pair<>(source, destination), distanceThroughIntermediate);
    }

    private Integer getDistance(Node intermediate, Node source) {
        return distances.get(new Pair<>(source, intermediate));
    }

    private boolean thereAreEdgesBetween(Node intermediate, Node source, Node destination) {
        return distances.containsKey(new Pair<>(source, destination)) &&
                distances.containsKey(new Pair<>(source, intermediate)) &&
                distances.containsKey(new Pair<>(intermediate, destination));
    }

    public void printDistances(){
//        distances.forEach((n1, n2) -> System.out.println( "From "+ n1.getKey() + " to " n2.g" distance " + elem.getValue()));
        distances.forEach((key,val)->{
                System.out.println("From " + key.getKey().getName() + " to "
                                    +  key.getValue().getName() + " the distance is " + val);
        });
    }
}
