package by.lesson3.task1;

public class Dog extends Animal{
    private static int dogsCounter = 0;

    public Dog() {
        super();
        dogsCounter++;
    }

    public Dog(String name) {
        super(name);
        dogsCounter++;
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
        if(distance > 500) {
            System.out.println(super.name + " не может пробежать так далеко");
            return;
        }
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if(distance > 10) {
            System.out.println(super.name + " не может проплыть так далеко");
            return;
        }
        super.swim(distance);
    }

    public void printDogsNumber() {
        System.out.println("Количество собак: " + dogsCounter);
    }
}
