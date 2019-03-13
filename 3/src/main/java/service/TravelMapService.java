package service;

import graph.Node;
import interfaces.Payable;
import interfaces.Visitable;
import model.LocationWithBusinessHours;
import model.TravelMap;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TravelMapService {
    private TravelMap travelMap;


    public TravelMapService(TravelMap travelMap) {
        this.travelMap = travelMap;
    }


    public TravelMap getTravelMap() {
        return travelMap;
    }

    public void setTravelMap(TravelMap travelMap) {
        this.travelMap = travelMap;
    }


    public void printVisitableButNotPlayableLocations() {
        travelMap.getNodes().stream()
                .filter(node -> node instanceof Visitable)
                .filter(node -> !(node instanceof Payable))
                .sorted(Comparator.comparing(node -> ((Visitable) node).getOpeningTimes().stream().findFirst().get().getFrom()
                        .compareTo(((Visitable) node).getOpeningTimes().stream().findFirst().get().getFrom())))
                .forEach(System.out::println);
    }

    public void printAveragePriceOfPayableLocations(){
        travelMap.getNodes().stream()
                .filter(node -> node instanceof Payable)
                .mapToInt(node -> ((Payable) node).getFee())
                .average()
                .ifPresent(System.out::println);
    }
}
