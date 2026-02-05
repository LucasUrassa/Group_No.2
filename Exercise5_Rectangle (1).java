
/**
 * Write a description of class Exercise5_Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise5_Rectangle
{

    private double length;
    private double width;
    private String color;
    private boolean isFilled;
    
    public Exercise5_Rectangle() {
        this.length = 1;
        this.width = 1;
        this.color = "white";
        this.isFilled = false;
    }


    public Exercise5_Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
        this.color = "white";
        this.isFilled = false;
    }
    
    public Exercise5_Rectangle(double length, double width,
                               String color, boolean isFilled) {
        setLength(length);
        setWidth(width);
        this.color = color;
        this.isFilled = isFilled;
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }


    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    // 5. Behavior methods
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public boolean isSquare() {
        return length == width;
    }

    public void resize(double factor) {
        if (factor > 0) {
            length *= factor;
            width *= factor;
        }
    }

    public String compare(Exercise5_Rectangle other) {
        double thisArea = calculateArea();
        double otherArea = other.calculateArea();

        if (thisArea > otherArea) {
            return "larger";
        } else if (thisArea < otherArea) {
            return "smaller";
        } else {
            return "equal";
        }
    }

    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Color: " + color);
        System.out.println("Filled: " + isFilled);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Diagonal: " + calculateDiagonal());
        System.out.println("Is Square: " + isSquare());
    }


    public static void main(String[] args) {
        System.out.println("=== Rectangle Geometry Exercise ===\n");

    
        Exercise5_Rectangle rect1 = new Exercise5_Rectangle();
        Exercise5_Rectangle rect2 = new Exercise5_Rectangle(10, 5);
        Exercise5_Rectangle rect3 =
                new Exercise5_Rectangle(7, 7, "blue", true);

    
        rect1.displayInfo();
        rect2.displayInfo();
        rect3.displayInfo();

    
        System.out.println("rect1 is square: " + rect1.isSquare());
        System.out.println("rect2 is square: " + rect2.isSquare());
        System.out.println("rect3 is square: " + rect3.isSquare());

    
        System.out.println("\nrect1 compared to rect2: " +
                rect1.compare(rect2));

    
        rect1.resize(3);

    
        System.out.println("\nrect1 after resize:");
        rect1.displayInfo();

    
        double totalArea =
                rect1.calculateArea() +
                rect2.calculateArea() +
                rect3.calculateArea();

        System.out.println("Total area of all rectangles: " + totalArea);

        System.out.println("\n=== Exercise Complete ===");
    }

}