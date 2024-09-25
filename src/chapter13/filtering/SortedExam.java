package chapter13.filtering;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/*
가공 3 - sorted

 */
public class SortedExam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("e","a","c","b","f");

        list.stream()
                .sorted()
                .forEach(x-> System.out.print(x+" "));
        System.out.println();

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(x-> System.out.print(x+" "));
    }
}
