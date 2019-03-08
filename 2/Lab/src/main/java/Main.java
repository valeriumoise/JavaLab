import java.time.LocalDate;

/**
 * @author tketa
 */
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("S1", "2");
        Student s2 = new Student("S2", "1");
        Student s3 = new Student("S3", "2");
        Student s4 = new Student("S4", "3");
        Application a1 = new Application("A1", LocalDate.parse("2019-06-01"), Language.JAVA);
        Application a2 = new Application("A2", LocalDate.parse("2019-06-03"), Language.Pascal);
        Application a3 = new Application("A3", LocalDate.parse("2019-05-03"), Language.C);
        Essay e1 = new Essay("E1", LocalDate.parse("2019-06-01"), Topic.ALGORITHMS);
        Essay e2 = new Essay("E2", LocalDate.parse("2019-05-21"), Topic.DATABASES);

        s1.setPreferences(a1, a2, a3);
        s2.setPreferences(a1, e1);
        s3.setPreferences(a2, a3, e1);
        s4.setPreferences(a3, e2);

        Problem problem = new Problem();
        problem.setStudents(s1, s2, s3, s4);

        HallsTheorem hallsTheorem = new HallsTheorem();

        if (hallsTheorem.hasMatching(problem.getStudents())) {
            System.out.println("Has Matching");
        } else {
            System.out.println("Doesn't have Matching");
        }

        Matcher matcher = new Matcher(problem);
        matcher.generateMatching();
        matcher.printMatching();

    }
}
