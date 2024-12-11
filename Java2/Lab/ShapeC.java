package Java2.Lab.notes;

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
        return "Fill Color: " + fillColor + ", Border Color: " + borderColor +
                ", Fill: " + fill + ", Border Width: " + borderWidth;
    }
}

 class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String fillColor, String borderColor, boolean fill, int borderWidth, double length, double width) {
        super(fillColor, borderColor, fill, borderWidth);
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString() + ", Length: " + length + ", Width: " + width;
    }
}

 class Circle extends Shape {
    private double radius;

    public Circle(String fillColor, String borderColor, boolean fill, int borderWidth, double radius) {
        super(fillColor, borderColor, fill, borderWidth);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public String toString() {
        return "Circle: " + super.toString() + ", Radius: " + radius;
    }
}

public class ShapeC {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle("Red", "Black", true, 5, 10.5, 4.2);
        System.out.println(rectangle);

        Circle circle = new Circle("Yellow", "Blue", true, 3, 7.5);
        System.out.println(circle);
    }
}