package chapter13.filtering.example;

import java.util.Arrays;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        // 연습문제 -2
        List<String> sentences = Arrays.asList("Hello:world","Java:stream:flatMap","Functional:programming");
        List<String> result02;
        result02 = sentences.stream().flatMap(x->Arrays.stream(x.split(":"))).toList();
        System.out.println(result02);

    }
}
