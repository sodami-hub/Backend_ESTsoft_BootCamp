package Day07._03_inherit03;

public class Person {
    String name;
    String ssn;

    Person(String name, String ssn) {
        this.name = name;
        this.ssn=ssn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
