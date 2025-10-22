package math;

public class InverseEquation {
    private double a;
    private double b;
    private double c;

    public InverseEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculate(double x) {
        if (!isValid(x)) {
            throw new IllegalArgumentException("Invalid input value");
        }
        return a / (b * x + c);
    }

    private boolean isValid(double x) {
        double denominator = b * x + c;
        return denominator != 0;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
