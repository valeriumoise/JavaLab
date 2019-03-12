package model;

import graph.Node;
import interfaces.Classifiable;

public class Hotel extends Node implements Classifiable {

    private String classification;

    public Hotel(){

    }

    public Hotel(String longitude,String latitude, String name){
        super(longitude,latitude,name);
    }
    @Override
    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String getClassification() {
        return classification;
    }
}
