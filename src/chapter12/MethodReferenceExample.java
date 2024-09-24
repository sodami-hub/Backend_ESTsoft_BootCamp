package chapter12;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메소드 호출.
        // operator = (x,y) -> Calculator.staticMethod(x,y);  // 람다 표현식 형태
        // operator = Calculator::staticMethod;               // 메소드 참조 형태.

        // 인스턴스 메소드 호출
        Calculator calc = new Calculator();
        //operator = (x,y) -> calc.instanceMethod(x,y); // 람다 표현식 형태
        //operator = calc::instanceMethod;              // 메소드 참조 형태
    }
}
