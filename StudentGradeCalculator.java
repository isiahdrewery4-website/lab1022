import javax.swing.JOptionPane;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        try {
            String score1Input = JOptionPane.showInputDialog(
                    "Enter the first test score:");
            if (score1Input == null) return;

            String score2Input = JOptionPane.showInputDialog(
                    "Enter the second test score:");
            if (score2Input == null) return;

            String score3Input = JOptionPane.showInputDialog(
                    "Enter the third test score:");
            if (score3Input == null) return;

            double score1 = Double.parseDouble(score1Input.trim());
            double score2 = Double.parseDouble(score2Input.trim());
            double score3 = Double.parseDouble(score3Input.trim());

            if (score1 < 0 || score1 > 100 ||
                score2 < 0 || score2 > 100 ||
                score3 < 0 || score3 > 100) {
                JOptionPane.showMessageDialog(
                        null, "Enter scores from 0 to 100.");
                return;
            }

            double average = (score1 + score2 + score3) / 3.0;
            String grade;

            if (average >= 90) {
                grade = "A";
            } else if (average >= 80) {
                grade = "B";
            } else if (average >= 70) {
                grade = "C";
            } else if (average >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            String result = String.format(
                    "Student Grade Results\n\n" +
                    "Average Score: %.2f\n" +
                    "Letter Grade: %s",
                    average, grade);

            JOptionPane.showMessageDialog(
                    null, result, "Grade Results",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null, "Please enter valid numeric test scores.");
        }
    }
}
