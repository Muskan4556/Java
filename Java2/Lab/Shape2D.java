package Java2.Lab.notes;

// Shape.java
class Shape {
    private String fillColor;
    private String borderColor;
    private boolean fill;
    private int borderWidth;

    // Constructor
    public Shape(String fillColor, String borderColor, boolean fill, int borderWidth) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.fill = fill;
        this.borderWidth = borderWidth;
    }

    // Getters and Setters
    public String getFillColor() { return fillColor; }
    public void setFillColor(String fillColor) { this.fillColor = fillColor; }

    public String getBorderColor() { return borderColor; }
    public void setBorderColor(String borderColor) { this.borderColor = borderColor; }

    public boolean isFill() { return fill; }
    public void setFill(boolean fill) { this.fill = fill; }

    public int getBorderWidth() { return borderWidth; }
    public void setBorderWidth(int borderWidth) { this.borderWidth = borderWidth; }

    @Override
    public String toString() {
        return "Shape{" +
                "fillColor='" + fillColor + '\'' +
                ", borderColor='" + borderColor + '\'' +
                ", fill=" + fill +
                ", borderWidth=" + borderWidth +
                '}';
    }
}

// TwoDShape.java
class TwoDShape extends Shape {
    public TwoDShape(String fillColor, String borderColor, boolean fill, int borderWidth) {
        super(fillColor, borderColor, fill, borderWidth);
    }
}

// ThreeDShape.java
class ThreeDShape extends Shape {
    public ThreeDShape(String fillColor, String borderColor, boolean fill, int borderWidth) {
        super(fillColor, borderColor, fill, borderWidth);
    }
}

// Rectangle.java
class Rectangle extends TwoDShape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String fillColor, String borderColor, boolean fill, int borderWidth) {
        super(fillColor, borderColor, fill, borderWidth);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Length=" + length +
                ", Width=" + width +
                ", " + super.toString() +
                '}';
    }
}

// Circle.java
class Circle extends TwoDShape {
    private double radius;

    public Circle(double radius, String fillColor, String borderColor, boolean fill, int borderWidth) {
        super(fillColor, borderColor, fill, borderWidth);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + radius +
                ", " + super.toString() +
                '}';
    }
}

// Cuboid.java
class Cuboid extends ThreeDShape {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height, String fillColor, String borderColor, boolean fill, int borderWidth) {
        super(fillColor, borderColor, fill, borderWidth);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "Length=" + length +
                ", Width=" + width +
                ", Height=" + height +
                ", " + super.toString() +
                '}';
    }
}

// Sphere.java
class Sphere extends ThreeDShape {
    private double radius;

    public Sphere(double radius, String fillColor, String borderColor, boolean fill, int borderWidth) {
        super(fillColor, borderColor, fill, borderWidth);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "Radius=" + radius +
                ", " + super.toString() +
                '}';
    }
}

public class Shape2D {
    public static void main(String[] args) {
        
        TwoDShape rectangle = new Rectangle(5.0, 10.0, "Red", "Blue", true, 4);
        System.out.println(rectangle);

        ThreeDShape cuboid = new Cuboid(5.0, 10.0, 15.0, "Green", "Yellow", true, 4);
        System.out.println(cuboid);

        ThreeDShape sphere = new Sphere(6.0, "Purple", "Pink", true, 7);
        System.out.println(sphere);
    }
}

