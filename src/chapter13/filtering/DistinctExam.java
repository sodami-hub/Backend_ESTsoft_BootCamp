package chapter13.filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
가공 1.
distinct - 중복 제거
 */


public class DistinctExam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","b","d","e","f","g","e");

        list.stream()
                .distinct()
                .forEach(x->System.out.print(x+" "));
    }
}
