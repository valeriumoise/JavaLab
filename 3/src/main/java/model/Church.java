package model;

import interfaces.Visitable;

import java.util.Set;

public class Church extends LocationWithBusinessHours {

    /**
     * model.Church constructor method
     *
     * @param longitude the longitude at witch the church is located
     * @param latitude  the latitude at witch the church is located
     * @param name      the name of the church
     */
    public Church(String longitude, String latitude, String name) {

        super(longitude, latitude, name);

    }

    public Church(String longitude, String latitude, String name, Set<OpeningTimes> openingTimes) {
        super(longitude, latitude, name, openingTimes);
    }

    @Override
    public String toString() {
        return "Church{}" + getOpeningTimes().toString();
    }
}
