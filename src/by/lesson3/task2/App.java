package by.lesson3.task2;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle("Жёлтый", "Чёрный", 7);
        circle.printFigureInfo();
        System.out.println();

        Triangle triangle = new Triangle("Синий", "Белый", 4, 8, 5);
        triangle.printFigureInfo();
        System.out.println();

        Rectangle rectangle = new Rectangle("Зелёный", "Фиолетовый", 5, 12);
        rectangle.printFigureInfo();
    }
}
