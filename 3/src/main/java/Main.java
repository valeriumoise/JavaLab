import model.*;
import service.FloydWarshallService;
import service.TravelMapService;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.MonthDay;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<OpeningTimes> openingTimes = new HashSet<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            openingTimes.add(new OpeningTimes(day, LocalTime.of(8, 0), LocalTime.of(22, 0)));
        }

        Hotel v1 = new Hotel("2", "1", "California");
        Museum v2 = new Museum("1", "2", "Museum A",openingTimes);
        Museum v3 = new Museum("1", "2", "Museum B",openingTimes);
        Church v4 = new Church("3", "4", "Church A",openingTimes);
        Church v5 = new Church("1", "3", "Church B",openingTimes);
        Restaurant v6 = new Restaurant("2", "3", "Restaurant",openingTimes);
        TravelMap map = new TravelMap();
        setupMap(v1, v2, v3, v4, v5, v6, map);

        System.out.println("The Map is: \n" + map.getNodesToString());

        TravelMapService travelMapService = new TravelMapService(map);
        travelMapService.printVisitableButNotPlayableLocations();
        travelMapService.printAveragePriceOfPayableLocations();


        System.out.println("Distances:");
        FloydWarshallService floydWarshallService = new FloydWarshallService();
        floydWarshallService.floydWarshall(map.getNodes(),map.getEdges());
        floydWarshallService.printDistances();
    }

    private static void setupMap(Hotel v1, Museum v2, Museum v3, Church v4, Church v5, Restaurant v6, TravelMap map) {
        map.addNode(v1);
        map.addNode(v2);
        map.addNode(v3);
        map.addNode(v4);
        map.addNode(v5);
        map.addNode(v6);

        map.addEdge(v1, v2, 15);
        map.addEdge(v1, v3, 10);
        map.addEdge(v3, v2, 1, false);
        map.addEdge(v3, v4, 2);
        map.addEdge(v4, v5, 1);
        map.addEdge(v5, v6, 1);
        map.addEdge(v2, v6, 10);

    }
}
