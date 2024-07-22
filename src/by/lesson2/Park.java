package by.lesson2;

public class Park {
    private Attraction[] attractions;
    private int length;
    private class Attraction {
        private String name;
        private String workingTime;
        private double cost;

        public Attraction(String name, String workingTime, double cost) {
            this.name = name;
            this.workingTime = workingTime;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getWorkingTime() {
            return workingTime;
        }

        public double getCost() {
            return cost;
        }

        @Override
        public String toString() {
            return "Name: " + getName() + "\nWorking time: " + getWorkingTime() + "\nCost: " + getCost();
        }
    }

    public Attraction[] getAttractions() {
        return attractions;
    }

    public Park(int size) {
        attractions = new Attraction[size];
        length = 0;
    }

    public void addAttraction(String name, String workingTime, double cost) {
        Attraction attraction = new Attraction(name, workingTime, cost);
        attractions[length] = attraction;
        length++;
    }
}
