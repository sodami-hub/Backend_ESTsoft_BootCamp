package Day07.inherit_example;

public class EmployeeExample {
    public static void main(String[] args) {
        FullTimeEmployee fe = new FullTimeEmployee("Alice",1000);
        PartTimeEmployee pe = new PartTimeEmployee("Bob",30,30);

        System.out.println(fe.name+"의 salary :" + fe.calculateSalary());
        System.out.println(pe.name+"의 salary :" + pe.calculateSalary());

        System.out.println();
        Employee em = new FullTimeEmployee("lee",20);  // 자식 클래스의 업캐스팅으로  추상 클래스 객체생성(??)
        System.out.println(em.name);
        System.out.println(em.calculateSalary());

    }
}
