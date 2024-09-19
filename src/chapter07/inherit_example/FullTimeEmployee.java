package chapter07.inherit_example;

public class FullTimeEmployee extends Employee{
    double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
