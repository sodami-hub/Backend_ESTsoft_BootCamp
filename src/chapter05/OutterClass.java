package chapter05;

public class OutterClass {
    public static void main(String[] args) {
        System.out.println("클래스 변수 = " + Variable.var01);  // 클래스 변수 객체 없이 사용 가능
        System.out.println("인스턴스 변수 = " + new Variable().var02); // 인스턴스 변수 - 객체를 생성해야 됨

        Variable var = new Variable();
        var.method01(3);
        var.var02=100;
    }
}
