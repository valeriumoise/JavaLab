package model;

import graph.Node;
import interfaces.Visitable;

import java.util.Set;

public class LocationWithBusinessHours extends Node implements Visitable,Comparable {
    private Set<OpeningTimes> openingTimes;

    public LocationWithBusinessHours(String longitude, String latitude, String name) {
        super(longitude, latitude, name);
    }

    public LocationWithBusinessHours(String longitude, String latitude, String name, Set<OpeningTimes> openingTimes) {
        super(longitude, latitude, name);
        this.openingTimes = openingTimes;
    }

    public Set<OpeningTimes> getOpeningTimes() {
        return openingTimes;
    }

    public void setOpeningTimes(Set<OpeningTimes> openingTimes) {
        this.openingTimes = openingTimes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocationWithBusinessHours{" + "openingHours" + '}');
        openingTimes.forEach(ot -> stringBuilder.append(ot.toString()));
        return stringBuilder.toString();
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
