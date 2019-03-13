package model;

import interfaces.Payable;
import interfaces.Visitable;

import java.util.Set;

public class Museum extends LocationWithBusinessHours implements Visitable, Payable {

    private int entryFee;

    public Museum(String longitude, String latitude, String name) {
        super(longitude, latitude, name);
    }

    public Museum(String longitude, String latitude, String name, Set<OpeningTimes> openingTimes) {
        super(longitude, latitude, name, openingTimes);
    }

    @Override
    public int getFee() {
        return this.entryFee;
    }

    @Override
    public void setFee(int entryFee) {
        this.entryFee = entryFee;
    }

    @Override
    public String toString() {
        return "Museum{" +
                getOpeningTimes().toString() + '\'' +
                ", entryFee=" + entryFee +
                '}';
    }
}
