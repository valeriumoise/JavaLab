import java.time.LocalDate;

/**
 * @author tketa
 */

public class Application extends Project {

    private Language language;

    /**
     * Create an instance of a project of type application
     *
     * @param projectName The name of the project
     * @param deadline    the deadline of the project
     * @param language    the language of the application
     */
    public Application(String projectName, LocalDate deadline, Language language) {

        this.projectName = projectName;
        this.deadline = deadline;
        this.language = language;

    }

    //TODO: make getters and setter
    @Override
    public String toString() {

        return "A(" + projectName + " " + deadline + " " + language + ")";
    }


}
