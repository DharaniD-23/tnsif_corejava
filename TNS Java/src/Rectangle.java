
public class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize rectangle with length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter of rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Creating a rectangle with length 5 and width 3
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}



