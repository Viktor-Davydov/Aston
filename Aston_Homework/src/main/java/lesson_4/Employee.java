package lesson_4;

public class Employee {
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employee(String name, String position, String email, String phoneNumber,
                    int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getValues() {
        String employeeInfo = "Name: " + name + ", Position: " + position + ", " +
                "Email: " + email + ", Phone number: " + phoneNumber + ", Salary: " + salary +
                ", Age: " + age;
        return employeeInfo;
    }
}