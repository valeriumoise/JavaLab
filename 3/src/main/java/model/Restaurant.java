package model;

import interfaces.Classifiable;
import interfaces.Payable;
import interfaces.Visitable;

public class Restaurant extends ScheduledLocation implements Classifiable, Payable, Visitable {

    private String classification;
    private int entryFee;

    public Restaurant(String longitude, String latitude, String name) {
        super(longitude, latitude, name);
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
                "openingHour='" + getHours().get(0) + '\'' +
                ", closingHour='" + getHours().get(1) + '\'' +
                ", classification='" + classification + '\'' +
                ", entryFee=" + entryFee +
                '}';
    }
}
