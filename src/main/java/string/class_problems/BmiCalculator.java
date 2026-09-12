package string.class_problems;

public class BmiCalculator {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.printf("%-10s %-12s %-12s %-8s %-12s%n", "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("%-10s %-12.2f %-12.2f %-8.2f %-12s%n",
                    "Person " + (i + 1), heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {
        double[] heights = {1.75, 1.60, 1.82, 1.68, 1.55, 1.90, 1.73, 1.65, 1.78, 1.60};
        double[] weights = {70, 90, 85, 55, 48, 95, 68, 72, 60, 100};

        printWellnessReport(heights, weights);
    }
}
