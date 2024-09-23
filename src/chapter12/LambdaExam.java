package chapter12;

import chapter12.custom.MyFunctionalInterface01;
import chapter12.custom.MyFunctionalInterface02;
import chapter12.custom.MyFunctionalInterface03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExam {
    public static void main(String[] args) {
        Runnable run;

        run =() -> System.out.println("aa");

        run.run();


        // 익명 구현 객체를 통한 인터페이스 구현 및 호출
        MyFunctionalInterface01 myLambda = new MyFunctionalInterface01() {
            @Override
            public void run() {
                System.out.println("hello lambda");
            }
        };

        myLambda.run();


        // 람다 표현식을 통한 인터페이스 구현 및 호출
        MyFunctionalInterface01 myLambda02 = () -> {
            System.out.println("run lambda expression");
        };
        myLambda02.run();


        // 매개변수가 있는 람다식, 리턴타입은 없다.
        MyFunctionalInterface02 myLambda03 = (x) -> System.out.println(x);
        myLambda03.myMethod(34);

        // 매개변수와 리턴타입이 있는 람다식
        
        
        MyFunctionalInterface03 myLambda04 = (x) -> {
            System.out.println("입력값 : "+ x);
            return x*2;
        };
        
        int result = myLambda04.method(123);
        System.out.println("result = " + result);


        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList()); // [2,4]
    }
}
