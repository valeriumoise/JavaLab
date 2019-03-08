import java.util.HashMap;
import java.util.Map;

/**
 * @author tketa
 */

public class Matcher {

    private Problem problem;
    private Map<Project, Student> matching;

    /**
     * Builds a new instance of matcher
     *
     * @param problem The problem for witch we want to apply the matching
     */
    public Matcher(Problem problem) {
        this.problem = problem;
        this.matching = new HashMap<>();
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public Map<Project, Student> getMatching() {
        return matching;
    }

    public void setMatching(Map<Project, Student> matching) {
        this.matching = matching;
    }

    /**
     * Method to check is student is already enrolled in a project
     *
     * @param student the desired student to check for
     * @return 'true' if the student is eligible and 'false' otherwise
     */
    private boolean isEligibleStudent(Student student) {
        for (Map.Entry<Project, Student> m : matching.entrySet()) {
            if (m.getValue().equals(student)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Generates the matching between students and project and stores the result in 'matching'
     */
    public void generateMatching() {
        for (Student s : problem.getStudents()) {
            for (Project p : s.getPreferences()) {
                if (s.getPreferences().contains(p) && isEligibleStudent(s)) {
                    if (!matching.containsKey(p)) {
                        matching.put(p, s);
                    }
                }
            }
        }
    }

    /**
     * Prints the matching;
     */
    public void printMatching() {
        for (Map.Entry<Project, Student> m : matching.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
    }
}
