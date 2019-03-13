package model;

import interfaces.Classifiable;
import interfaces.Payable;
import interfaces.Visitable;

import java.util.Set;

public class Restaurant extends LocationWithBusinessHours implements Classifiable, Payable, Visitable {

    private String classification;
    private int entryFee;

    public Restaurant(String longitude, String latitude, String name) {
        super(longitude, latitude, name);
    }

    public Restaurant(String longitude, String latitude, String name, Set<OpeningTimes> openingTimes) {
        super(longitude, latitude, name, openingTimes);
    }

    public Restaurant(String longitude, String latitude, String name, Set<OpeningTimes> openingTimes, String classification, int entryFee) {
        super(longitude, latitude, name, openingTimes);
        this.classification = classification;
        this.entryFee = entryFee;
    }

    @Override
    public String getClassification() {
        return classification;
    }

    @Override
    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public int getFee() {
        return entryFee;
    }

    @Override
    public void setFee(int entryFee) {
        this.entryFee = entryFee;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                getOpeningTimes().toString() +
                ", classification='" + classification + '\'' +
                ", entryFee=" + entryFee +
                '}';
    }
}
