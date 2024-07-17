package by.lesson3.task2;

public class Rectangle extends Figure implements IShape{
    private double sidesA;
    private double sidesB;

    public Rectangle(String fillColor, String borderColor, double sidesA, double sidesB) {
        super(fillColor, borderColor);
        this.sidesA = sidesA;
        this.sidesB = sidesB;
    }

    public double getSidesA() {
        return sidesA;
    }

    public void setSidesA(double sidesA) {
        this.sidesA = sidesA;
    }

    public double getSidesB() {
        return sidesB;
    }

    public void setSidesB(double sidesB) {
        this.sidesB = sidesB;
    }

    @Override
    public double calculatePerimeter() {
        return (sidesA + sidesB) * 2;
    }

    @Override
    public double calculateArea() {
        return sidesA * sidesB;
    }

    @Override
    public void printFigureInfo() {
        System.out.println("Информация о прямоугольнике:");
        System.out.println("Первая пара сторон: " + sidesA);
        System.out.println("Вторая пара сторон: " + sidesB);
        super.printFigureInfo();
    }
}
