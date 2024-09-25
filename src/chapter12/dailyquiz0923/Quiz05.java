package chapter12.dailyquiz0923;

/*
1. 4 - @FunctionalInterface를 붙이는 것은 선택사항이지만, 컴파일 과정에서
정확하게 작성할 수 있도록 도와준다.
2. 4 - 클래스::new(매개변수) 와 같이 컴파일러는 함수형 인터페이스의 추상 메소드와 동일한
매개변수 타입과 개수를 가지고 있는 생성자를 찾아 실행한다.
3. 2 - 매개변수가 두개 이상이면 괄호로 묶어준다.
4. IntSupplier 구현 객체 안에 선언되지 않은 변수 x는 final로 선언된다.
 */


import java.util.function.IntBinaryOperator;

public class Quiz05 {

    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin((x,y) -> {  // 람다 표현식
            return Math.max(x,y);
        });
        System.out.println("최대값 : " + max);

        int min = maxOrMin(Math::min);  // 메소드 참조
        System.out.println("최소값: " + min);
    }
}
