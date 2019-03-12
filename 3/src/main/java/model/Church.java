package model;

import graph.Node;
import interfaces.Visitable;

import java.util.ArrayList;
public class Church extends Node implements Visitable {

    private String openingHour;
    private String closingHour;

    /**
     * setHours method
     * @param openingHour opening hour for the church
     * @param closingHour closing hour for the church
     */
    @Override
    public void setHours(String openingHour, String closingHour) {
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }

    /**
     * get hours method
     *
     * @return a list containing the opening and the closing hour
     */
    @Override
    public ArrayList<String> getHours() {
        ArrayList<String> temporaryOpeningHours = new ArrayList<String>();
        temporaryOpeningHours.add(this.openingHour);
        temporaryOpeningHours.add(this.closingHour);

        return temporaryOpeningHours;
    }

    /**
     * model.Church constructor method
     * @param longitude the longitude at witch the church is located
     * @param latitude the latitude at witch the church is located
     * @param name the name of the church
     */
    public Church(String longitude, String latitude, String name){

        super(longitude,latitude,name);

    }
}
