package math;

public class MainClass {
    public static void main(String[] args) {
        // Example usage of InverseEquation
        InverseEquation equation = new InverseEquation(10, 2, 5);

        try {
            double x = 3.0;
            double result = equation.calculate(x);
            System.out.println("For x = " + x + ", result = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
