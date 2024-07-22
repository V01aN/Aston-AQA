package by.lesson2;

public class Employee {
    private String fullName;
    private String post;
    private int age;
    private String email;
    private double salary;
    private String phoneNumber;

    public Employee(String fullName, String post, int age, String email, double salary, String phoneNumber) {
        this.fullName = fullName;
        this.post = post;
        this.age = age;
        this.email = email;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public void printInfo() {
        System.out.println("Full name: " + fullName);
        System.out.println("Post: " + post);
        System.out.println("Age: " + age);
        System.out.println("email: " + email);
        System.out.println("Salary: $" + salary);
        System.out.println("Phone number: " + phoneNumber);
    }
}
