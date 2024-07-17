package by.lesson3.task2;

public class Circle extends Figure implements IShape {
    private double radius;

    public Circle(String fillColor, String borderColor, double radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printFigureInfo() {
        System.out.println("Информация о круге:");
        System.out.println("Радиус: " + radius);
        super.printFigureInfo();
    }
}
