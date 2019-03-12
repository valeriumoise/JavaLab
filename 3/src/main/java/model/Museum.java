package model;

import graph.Node;
import interfaces.Payable;
import interfaces.Visitable;

import java.util.ArrayList;

public class Museum extends Node implements Visitable, Payable {

    private String openingHour;
    private String closingHour;
    private int entryFee;

    @Override
    public void setHours(String openingHour, String closingHour) {
        this.openingHour=openingHour;
        this.closingHour=closingHour;
    }

    @Override
    public ArrayList<String> getHours() {
        ArrayList<String> temporaryOpeningHours = new ArrayList<String>();
        temporaryOpeningHours.add(this.openingHour);
        temporaryOpeningHours.add(this.closingHour);

        return temporaryOpeningHours;
    }

    @Override
    public void setFee(int entryFee) {
        this.entryFee=entryFee;
    }

    @Override
    public int getFee() {
        return this.entryFee;
    }

    public Museum(String longitude, String latitude, String name){
        super(longitude,latitude,name);
    }

    public Museum(){

    }
}
