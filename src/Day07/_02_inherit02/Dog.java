package Day07._02_inherit02;

public class Dog extends Animal{
    void sleep(int times) {    // 메소드의 시그니쳐가 부모 클래스의 sleep() 과는 다르기 때문에 오버로딩이다.
        System.out.println(name + "   Zzz..." + times + " hours");
    }

    /*
    @Override
    void sleep() {      // 부모 클래스의 메소드와 시그니쳐가 같기 때문에 오버라이드이다.
        System.out.println("오버라이드");
    }
    */
}
