package interfaces;

import model.OpeningTimes;

import java.util.Set;

public interface Visitable {

   void setOpeningTimes(Set<OpeningTimes> openingTimes);

   Set<OpeningTimes> getOpeningTimes();


}
