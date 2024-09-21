package Java2.Lab2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            throw new ArithmeticException("The equation has no real roots.");
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            throw new ArithmeticException("The equation has no real roots.");
        }
    }

    public static void main(String[] args) {
        QuadraticEquation eq = new QuadraticEquation(1, -3, 2);

        System.out.println("a: " + eq.getA());
        System.out.println("b: " + eq.getB());
        System.out.println("c: " + eq.getC());

        System.out.println("Discriminant: " + eq.getDiscriminant());
        System.out.println("Root 1: " + eq.getRoot1());
        System.out.println("Root 2: " + eq.getRoot2());
        
    }
}

