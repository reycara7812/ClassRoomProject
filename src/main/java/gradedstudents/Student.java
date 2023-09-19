package gradedstudents;
import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();

        for (Double score : examScores) {
            this.examScores.add(score);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public double calculateAverageExamScore() {
        if (examScores.isEmpty()) {
            return 0.0; // Handle the case where there are no exam scores.
        }

        double sum = 0.0;
        for (Double score : examScores) {
            sum += score;
        }

        return sum / examScores.size();
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n" +
                "Exam Scores: " + examScores.toString();
    }
}











