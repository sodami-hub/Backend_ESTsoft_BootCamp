package chapter12;

import java.util.function.ToIntBiFunction;

public class MethodParameterReferencesExample {
    public static void main(String[] args) {
        ToIntBiFunction<String,String> function;

        function = (x,y) -> x.compareToIgnoreCase(y);  // 대소문자 구분 X, 같으면 0, 음수면 x가 먼저, 양수면 y가 먼저(사전순).
        // function = String::compareToIgnoreCase;
        int result = function.applyAsInt("java","zava");
        System.out.println(result);

    }
}
