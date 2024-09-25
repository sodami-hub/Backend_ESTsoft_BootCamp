package chapter13.optional;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {

        List<Integer> list = null;

        Optional<List<Integer>> optional = Optional.ofNullable(list);
        optional.orElseGet(Collections::emptyList).forEach(System.out::print);

        // Optional 객체 생성 (empty(), of(), ofNullable())

        Optional<Integer> empty = Optional.empty();  // 빈객체 생성
        OptionalInt empty2 = OptionalInt.empty();   // 빈객체 생성
        OptionalDouble empty3 = OptionalDouble.empty();  // 빈객체 생성

        Optional<Integer> optional02 = Optional.of(354); // op() 는 value에 null을 넣으면 NPE 발생.. 잘 사용 안함

        Optional<Integer> optional03 = Optional.ofNullable(12345);

        // Optional 객체 꺼내기 ( get(), orElse(), orElseGet(), orElseThrow() )
        // Integer i = empty.orElseThrow(NoSuchElementException::new);// null인 경우 Exception 발생

        empty.orElse(123); // 옵셔널객체의 값이 null이면 디폴트로 정의한 값(123) 출력
        empty2.orElseGet(()->12); // orElseGet에는 람다 표현식(Supplier 클래스)을 작성한다.

        Integer i = optional02.orElseThrow(NoSuchElementException::new);
        System.out.println(i);

        // isPresent()  - 저장된 값이 있는지를 체크하는 메소드.

        if(optional03.isPresent()) {
            Integer integer = optional03.get();
            System.out.println(integer);
        }
    }
}
