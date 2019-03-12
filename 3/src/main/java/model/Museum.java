package model;

import interfaces.Payable;
import interfaces.Visitable;

public class Museum extends ScheduledLocation implements Visitable, Payable {

    private int entryFee;

    public Museum(String longitude, String latitude, String name) {
        super(longitude, latitude, name);
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
                "openingHour='" + openingHour + '\'' +
                ", closingHour='" + closingHour + '\'' +
                ", entryFee=" + entryFee +
                '}';
    }
}
