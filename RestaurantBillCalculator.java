import javax.swing.JOptionPane;

public class RestaurantBillCalculator {
    public static void main(String[] args) {
        try {
            String mealInput = JOptionPane.showInputDialog(
                    "Enter the meal cost:");
            if (mealInput == null) return;

            String tipInput = JOptionPane.showInputDialog(
                    "Enter the tip percentage (e.g., 15 for 15%):");
            if (tipInput == null) return;

            double mealCost = Double.parseDouble(mealInput.trim());
            double tipPercent = Double.parseDouble(tipInput.trim());

            if (!Double.isFinite(mealCost) ||
                !Double.isFinite(tipPercent) ||
                mealCost < 0 || tipPercent < 0) {
                JOptionPane.showMessageDialog(
                        null, "Meal cost and tip must be non-negative.");
                return;
            }

            double salesTax = mealCost * 0.06;
            double tip = mealCost * (tipPercent / 100.0);
            double total = mealCost + salesTax + tip;

            String result = String.format(
                    "Restaurant Bill Summary\n\n" +
                    "Meal Cost: $%.2f\n" +
                    "Sales Tax (6%%): $%.2f\n" +
                    "Tip (%.2f%%): $%.2f\n" +
                    "Total Bill: $%.2f",
                    mealCost, salesTax, tipPercent, tip, total);

            JOptionPane.showMessageDialog(
                    null, result, "Bill Summary",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null, "Please enter valid numeric values.");
        }
    }
}
