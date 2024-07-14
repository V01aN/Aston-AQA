package by.lesson2;

public class Employee {
    private String fullName;
    private String post;
    private int age;
    private String email;
    private double salary;
    private String phoneNumber;

    public Employee() {
        fullName = "unknown";
        post = "unknown";
        age = 0;
        email = "unknown";
        salary = 0;
        phoneNumber = "unknown";
    }

    public Employee(String fullName, String post, int age, String email, double salary, String phoneNumber) {
        this.fullName = fullName;
        this.post = post;
        this.age = age;
        this.email = email;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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
