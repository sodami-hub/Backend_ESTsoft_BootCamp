package chapter07.inherit_example;

public abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();
}
