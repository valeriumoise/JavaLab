import java.time.LocalDate;

/**
 * @author tketa
 */

public abstract class Project {

    protected String projectName;
    protected LocalDate deadline;

    public Project() {

    }

    /**
     * Build new instance of Project
     *
     * @param projectName The name of the project
     * @param deadline    The deeadline of the project
     */

    public Project(String projectName, LocalDate deadline) {
        this.projectName = projectName;
        this.deadline = deadline;
    }

    /**
     * Getter for project name
     *
     * @return The name of the project
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * Setter for projectName
     *
     * @param projectName The name of the project
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * Getter for deadline of project
     *
     * @return The project deadline
     */

    public LocalDate getDeadline() {
        return this.deadline;
    }

    /**
     * Setter for deadline
     *
     * @param deadline The deadline of the project
     */

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    /**
     * Gets the string representation of this object
     *
     * @return the string representation of this object
     */

    @Override
    public String toString() {

        return "This is a project";

    }

    @Override
    public boolean equals(Object obj) {

        Project project = (Project) obj;

        return project.projectName.equals(this.projectName) && project.deadline.equals(this.deadline);

    }
}
