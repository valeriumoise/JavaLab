import java.util.ArrayList;
import java.util.List;

/**
 * @author tketa
 */
public class Student {

    private String name;
    private String yearOfStudy;
    private List<Project> preferences;

    /**
     * Builds New Instance of Student
     *
     * @param name        Name of this Student
     * @param yearOfStudy Year of study of this student
     */

    public Student(String name, String yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.preferences = new ArrayList<Project>();
    }

    /**
     * Setter for the name of a student
     *
     * @param name Name of a student
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for year of study of a student
     *
     * @return The year of study for the student
     */

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    /**
     * Setter for year of study
     *
     * @param yearOfStudy Year of study of this student
     */

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    /**
     * Getter for name of student
     *
     * @return The name of the student
     */

    /**
     * Getter for preferences
     *
     * @return A list of preferred projects
     */

    public List<Project> getPreferences() {
        return this.preferences;
    }

    /**
     * Setter method or student preferences regarding projects
     *
     * @param preferencesArguments A variable argument list of projects
     */

    public void setPreferences(Project... preferencesArguments) {
        for (Project i : preferencesArguments) {
            this.preferences.add(i);
        }
    }

    /**
     * Gets the string representation of this object
     *
     * @return The string representation of this object
     */
    @Override
    public String toString() {
        return "(" + name + "," + yearOfStudy + ")";
    }

    @Override
    public boolean equals(Object obj) {

        Student student = (Student) obj;

        return student.name.equals(this.name) && student.yearOfStudy.equals(this.yearOfStudy);

    }
}
