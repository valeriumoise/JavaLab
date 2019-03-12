package model;

import interfaces.Visitable;

public class Church extends ScheduledLocation implements Visitable {

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

    @Override
    public String toString() {
        return "Church{" +
                "openingHour='" + openingHour + '\'' +
                ", closingHour='" + closingHour + '\'' +
                '}';
    }
}
