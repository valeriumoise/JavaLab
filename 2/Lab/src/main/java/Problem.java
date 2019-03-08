import java.util.ArrayList;
import java.util.List;

/**
 * @author tketa
 */

public class Problem {

    private List<Student> students;
    private List<Project> projects;

    /**
     * Builds a new instace of the problem
     */

    public Problem() {
        this.students = new ArrayList<Student>();
        this.projects = new ArrayList<Project>();
    }

    /**
     * Getter for projects
     *
     * @return A array of Projects
     */
    public String getProjects() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("P[");
        for (Project i : projects) {
            stringBuilder.append(i.toString() + " ");


        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    /**
     * Setter for projects
     *
     * @param projectList a project list
     */
    public void setProjects(Project... projectList) {

        for (Project i : projectList) {
            boolean check = false;
            for (Project temp : projects) {
                if (temp.equals(i)) {
                    check = true;
                }
            }
            if (!check) {
                projects.add(i);
            }
        }

    }

    /**
     * Getter method for students
     *
     * @return A list of the students
     */

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Setter method for the students of a problem
     *
     * @param studentList A list of students
     */

    public void setStudents(Student... studentList) {
        for (Student i : studentList) {
            boolean check = false;
            for (Student temp : students) {
                if (temp.equals(i)) {
                    check = true;
                }
            }
            if (!check) {
                students.add(i);
                for (Project j : i.getPreferences()) {
                    setProjects(j);
                }
            }
        }
    }

    /**
     * String representation of this object
     *
     * @return String representation of this object
     */

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("S[ ");
        for (Student i : students) {
            stringBuilder.append(i.toString() + " ");
        }
        stringBuilder.append("]");


        return stringBuilder.toString();

    }
}
