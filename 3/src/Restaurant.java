import java.util.ArrayList;

public class Restaurant extends Node implements Classifiable,Payable,Visitable {

    private String openingHour;
    private String closingHour;
    private String classification;
    private int entryFee;

    @Override
    public String getClassification() {
        return classification;
    }

    @Override
    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public void setHours(String openingHour, String closingHour) {
        this.openingHour=openingHour;
        this.closingHour=openingHour;
    }

    @Override
    public ArrayList<String> getHours() {
        ArrayList<String> temporaryOpeningHours = new ArrayList<String>();
        temporaryOpeningHours.add(this.openingHour);
        temporaryOpeningHours.add(this.closingHour);

        return temporaryOpeningHours;
    }

    @Override
    public int getFee() {
        return entryFee;
    }

    @Override
    public void setFee(int entryFee) {
        this.entryFee=entryFee;
    }

    Restaurant(){

    }
    Restaurant(String longitude, String latitude, String name){
        super(longitude,latitude,name);
    }
}
