package chapter13.filtering.example;

import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        // 연습문제 -1
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> result;
        result = numbers.stream().mapToInt(Integer::intValue).map(x->x*x).boxed().toList();
        System.out.println(result);
    }
}
