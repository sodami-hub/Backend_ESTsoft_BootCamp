package chapter12.constructorlamdba;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {
    public static void main(String[] args) {

        Function<String, Member> function = (x) -> new Member(x);
        function = Member::new;


        BiFunction<String, String, Member> function01 = (x,y)-> new Member(x,y);
        function01 = Member::new;
    }
}
