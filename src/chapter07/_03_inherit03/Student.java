package chapter07._03_inherit03;

public class Student extends Person {

    int studentNo;

    Student(String name, String ssn, int no) {
        super(name,ssn);  // 부모 클래스의 생성자가 먼저 나와야 됨.
        this.studentNo =no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
