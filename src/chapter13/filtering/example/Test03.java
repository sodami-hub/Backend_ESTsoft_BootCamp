package chapter13.filtering.example;

import java.util.Arrays;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        // 연습문제 - 3
        List<List<Integer>> numbers02 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        numbers02.stream()
                .flatMap(x->x.stream())
                .forEach(x-> System.out.print(x+" "));
        System.out.println();

    }
}
