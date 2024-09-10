package Day07._02_inherit02;

public class DogExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("happy");
        d.sleep(5);  // 부모 클래스의 메소드를 오버로딩.
        d.sleep();  // 부모 클래스의 메소드.`
    }
}
