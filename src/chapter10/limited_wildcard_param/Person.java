package chapter10.limited_wildcard_param;

public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
