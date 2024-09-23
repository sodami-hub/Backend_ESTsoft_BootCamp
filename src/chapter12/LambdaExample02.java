package chapter12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
함수형 인터페이스.
FunctionalInterface의 사용.
1. Runnable = p x, re x
2. Supplier = p x, re o
3. Consumer = p o, re x
4. Function = p o, re o
5. Predicate = p o, re boolean
 */

public class LambdaExample02 {
    public static void main(String[] args) {

        // Supplier 매개변수 없고, 리턴값이 있다.
        Supplier<String> supplier = () -> "hello, world";
        
        String str = supplier.get();
        System.out.println("str = " + str);


        // Consumer 매개변수 있고, 리턴값이 없다.
        Consumer<String> consumer = (x) -> {
            System.out.println(x+", hi!");
        };
        consumer.accept("jenny");
        
        
        //Function 하나의 매개변수, 리턴값
        Function<Integer, String> function =(x) -> String.valueOf(x)+"문자열로 반환";
        
        String result = function.apply(123);
        System.out.println("result = " + result);
        
        //Function 문자열을 매개변수로 받아서 Double값으로 리턴.
        Function<String, Double> function02 = (x) -> Double.valueOf(x)*10;
        double doubleValue = function02.apply("3.141592");
        System.out.println("doubleValue = " + doubleValue);
        
        
        
        // Predicate boolean 값 반환
        Predicate<Integer> predicate = (x) -> x>0;
        boolean check = predicate.test(3);
        System.out.println("check = " + check);

        Predicate<String> isNull = (x) -> x.length() == 0;
        check = isNull.test("");
        System.out.println("isNull = " + check);
        check = isNull.test("notNull");
        System.out.println("isNull = " + check);
    }
}
