package chapter11.set;

public class Member {

    private String name;
    private int age;

    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member m) {
            if(this.name.equals(m.getName()) && this.age == m.getAge()) {
                return true;
            }
        }
        return false;
    }
}
