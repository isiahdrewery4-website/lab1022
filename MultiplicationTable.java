import javax.swing.JOptionPane;

public class MultiplicationTable {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                "Enter an integer from 1 to 12:");

        if (input == null) {
            return;
        }

        int number;

        try {
            number = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null, "Please enter a whole number.");
            return;
        }

        if (number < 1 || number > 12) {
            JOptionPane.showMessageDialog(
                    null, "The number must be from 1 to 12.");
            return;
        }

        String table = "";

        for (int i = 1; i <= 12; i++) {
            table += number + " x " + i + " = "
                    + (number * i) + "\n";
        }

        JOptionPane.showMessageDialog(
                null, table, "Multiplication Table",
                JOptionPane.INFORMATION_MESSAGE);

        // Alternative while-loop version
        String whileTable = "";
        int i = 1;

        while (i <= 12) {
            whileTable += number + " x " + i + " = "
                    + (number * i) + "\n";
            i++;
        }

        // Uncomment this line to display the while-loop table:
        // JOptionPane.showMessageDialog(null, whileTable);
    }
}
