import model.*;

public class Main {

    public static void main(String[] args) {

        Hotel v1 = new Hotel("2", "1", "California");
        Museum v2 = new Museum("1", "2", "Museum A");
        Museum v3 = new Museum("1", "2", "Museum B");
        Church v4 = new Church("3", "4", "Church A");
        Church v5 = new Church("1", "3", "Church B");
        Restaurant v6 = new Restaurant("2", "3", "Restaurant");
        TravelMap map = new TravelMap();
        setupMap(v1, v2, v3, v4, v5, v6, map);

        System.out.println("The Map is: \n" + map.getNodesToString());

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
