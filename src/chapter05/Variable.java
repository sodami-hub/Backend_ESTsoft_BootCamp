package chapter05;

public class Variable {

    // 인스턴스 변수 -> Heap 영역에 저장
    // 클래스 변수 -> Method 영역에 저장
    // 위의 두 변수는 초기화를 하지 않아도 자동으로 초기화가 된다. 실무에서는 대부분 상수로만 사용된다.(final)
    // 왜냐하면 전역변수이므로 외부에서의 접근이 용이하기 때문이다.
    static int var01 = 1; // 클래스 변수 - 인스턴스 생성없이 사용 가능 (static) 클래스이름.변수이름
    int var02 = 2;  // 인스턴스 변수 - 인스턴스 생성하면 사용 가능 (non-static) 인스턴스이름.변수이름

    // 매개변수, 지역변수 -> Stack 영역에 저장
    public void method01(int var04) {   // 매개변수
        int var03=3;  // 지역변수


    }
}
