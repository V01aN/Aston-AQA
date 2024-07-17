package by.lesson3.task1;

public class Cat extends Animal {
    private static int catsCounter = 0;
    private boolean full = false;

    public Cat() {
        super();
        catsCounter++;
    }

    public Cat(String name)  {
        super(name);
        catsCounter++;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(super.name + " не может пробежать так далеко");
            return;
        }
        super.run(distance);
    }

    public void printCatsNumber() {
        System.out.println("Количество котов: " + catsCounter);
    }

    public void isFull() {
        if (full) {
            System.out.println(name + " сыт");
        }
        else {
            System.out.println(name + " голоден");
        }
    }

    public void eat(Bowl bowl, int amountOfFood) {
        if (bowl.getAmountOfFood() > amountOfFood) {
            System.out.println(name + " покушал из миски");
            full = true;
            bowl.setAmountOfFood(bowl.getAmountOfFood() - amountOfFood);
        }
        else {
            System.out.println(name + " недостаточно еды в миске");
        }
    }
}
