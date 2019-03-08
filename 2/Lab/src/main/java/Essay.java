import java.time.LocalDate;

/**
 * @author tketa
 */
public class Essay extends Project {

    private Topic topic;

    /**
     * Create and instance of the project of type Essay
     *
     * @param projectName The name of the Essay
     * @param deadline    The deadline for the Essay
     * @param topic       The topic of the Essay
     */
    public Essay(String projectName, LocalDate deadline, Topic topic) {

        this.projectName = projectName;
        this.deadline = deadline;
        this.topic = topic;

    }
    //TODO: make getter and setters

    /**
     * Gets the string representation of this object
     *
     * @return the string representation of this object
     */
    @Override
    public String toString() {

        return "E(" + projectName + " " + deadline + " " + topic + ")";
    }
}
