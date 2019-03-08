import java.util.ArrayList;

public interface Visitable {

    void setHours(String openingHour, String closingHour);

    ArrayList<String> getHours();
}
