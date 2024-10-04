package com.example.springdemoproject.ioc_example;

public class A {
    Inter inter;

    A() {

    }

    A(Inter inter) {
        this.inter = inter;  // 의존성 주입(생성자 주입) 또는 @Autowired
    }

    // 클래스 A,B,C -> 일반적인 자바의 객체 관리. 직접 객체를 생성하고 변경하며 유지보수한다.
    public void methodA() {
//        B objectB = new B();
//        objectB.methodB();
        // B클래스의 로직을 C클래스로의 변경
        C objectC = new C();
        objectC.methodC();

        // 또다른 로직으로 변경되면 또다른 클래스르 만들어서 객체를 생성하고 호출하게 됨.
    }

    // 인터페이스의 개념 적용 - 생성자로 인터페이스를 구현한 객체를 생성하고 사용.
    // 객체를 직접 생성하지는 않음
    // 로직을 변경하고 유지보수하는데 더 간편하고 가독성이 좋음
    public void methodA02() {
        inter.method();
    }

    /*
    제어의 역전(IoC) - 스프링에서 객체를 생성해준다.(의존성의 주입(DI))
    개발자는 생성된 객체를 가져다 쓰기만 하면됨
     */
}
