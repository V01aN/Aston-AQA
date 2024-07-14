package by.lesson2;

public class Park {
    private class Attraction {
        private String name;
        private String workingTime;
        private double cost;

        public Attraction() {
            name = "unknown";
            workingTime = "unknown";
            cost = 0;
        }

        public Attraction(String name, String workingTime, double cost) {
            this.name = name;
            this.workingTime = workingTime;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWorkingTime() {
            return workingTime;
        }

        public void setWorkingTime(String workingTime) {
            this.workingTime = workingTime;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
    }

    public Attraction[] attractions;
    int length;

    public Park() {
        attractions = new Attraction[5];
        length = 0;
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

    public void printAttractionInfo(int id) {
        System.out.println("Name: " + attractions[id].getName());
        System.out.println("Working time: " + attractions[id].getWorkingTime());
        System.out.println("Cost: " + attractions[id].getCost());
    }
}
