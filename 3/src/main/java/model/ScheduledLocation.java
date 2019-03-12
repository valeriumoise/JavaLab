package model;

import graph.Node;

import java.util.ArrayList;

public class ScheduledLocation extends Node {
    private String openingHour;
    private String closingHour;

    public ScheduledLocation(String longitude, String latitude, String name) {
        super(longitude, latitude, name);
    }


    /**
     * setHours method
     *
     * @param openingHour opening hour for the church
     * @param closingHour closing hour for the church
     */
    public void setHours(String openingHour, String closingHour) {
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }

    /**
     * get hours method
     *
     * @return a list containing the opening and the closing hour
     */
    public ArrayList<String> getHours() {
        ArrayList<String> temporaryOpeningHours = new ArrayList<>();
        temporaryOpeningHours.add(this.openingHour);
        temporaryOpeningHours.add(this.closingHour);
        return temporaryOpeningHours;
    }
}
