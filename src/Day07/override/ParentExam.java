package Day07.override;

public class ParentExam {
    public static void main(String[] args) {
        System.out.println("부모 클래스에서 메소드(1,2) 호출");
        Parent p = new Parent();
        p.method01();
        p.method02();

        System.out.println("\n상속받은 자식에게서 메소드(1,2,3) 호출");
        Child c = new Child();
        c.method01();
        c.method02();
        c.method03();


        System.out.println("\n부모 클래스로 업캐스팅 후 메소드(1,2) 호출");
        Parent d = (Parent)c;

        d.method01();
        d.method02();


    }
}
