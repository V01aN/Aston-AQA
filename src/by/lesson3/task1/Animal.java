package by.lesson3.task1;

public abstract class Animal {
    protected String name;
    private static int animalsCounter = 0;

    public Animal() {
        name = "unknown";
        animalsCounter++;
    }

    public Animal(String name) {
        this.name = name;
        animalsCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Некорректный ввод");
            return;
        }
        System.out.println(name + " пробежал " + distance + "м");
    }

    public void swim (int distance) {
        if (distance <= 0) {
            System.out.println("Некорректный ввод");
            return;
        }
        System.out.println(name + " проплыл " + distance + "м");
    }

    public static void printAnimalsNumber() {
        System.out.println("Количество животных: " + animalsCounter);
    }
}
