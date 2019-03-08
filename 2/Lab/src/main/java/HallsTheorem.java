import java.util.ArrayList;
import java.util.List;

/**
 * @author mvale
 */
public class HallsTheorem {

    public boolean hasMatching(List<Student> students) {
        int n = students.size();
        for (int i = 1; i < (1 << n); i++) {
            List<Student> studentSubSet = new ArrayList<>();
            int sumOfNeighbors = 0;
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0) {
                    studentSubSet.add(students.get(j));
                    sumOfNeighbors += students.get(j).getPreferences().size();
                }


            if (studentSubSet.size() > sumOfNeighbors)
                return false;
        }


        return true;
    }
}