package chapter13.filtering;
/*

peek과 forEach는 결과를 보여주는 기능을 한다.
하지만 쓰이는 위치같은게 다르다.

가공
peek - 가공(중간단계)

결과
forEach - 결과(반환값이 void 이다.)

 */

/*
primitive stream -> wrapper stream => boxed();
wrapper stream -> primitive stream => mapToInt(x->x)
 */


import java.util.Arrays;
import java.util.List;

public class LoopingExam {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        
        // 짝수를 걸러서 총 합
        int sum = list.stream()
                .filter(x->x%2==0)
                .peek(x-> System.out.print(x+" "))  // peek() 으로 중간 결과 확인. 최종 단계에서 확인할 수 없다.
                .mapToInt(x->x)
                .sum();

        System.out.println("sum = " + sum);


    }
}
