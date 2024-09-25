package chapter13.filtering;

/*
가공 2.
map,
스트림의 데이터를 일괄적으로 가공

flatMap
스트림에서 데이터를 가져와 또다른 스트림 생성
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class MapExam {
    public static void main(String[] args) {

        // map
        List<String> list = Arrays.asList("a","b","c","d","e");

        list.stream()
                .map(String::toUpperCase)
                .forEach(x-> System.out.print(x+" "));
        System.out.println();

        // flatmap  2차원 -> 1차원
        Integer[][] array =new Integer[][] {{1,2,3},{4,5,6}};

        //flatmap의 규칙!! 스트림의 형태로 결과가 반환되도록 처리해야 됨.  Arrays.stream(...)
        Arrays.stream(array)
                .flatMap(x->Arrays.stream(x))
                .forEach(x-> System.out.print(x+" "));

        //문자열을 각각의 스트림으로 해서 다시 하나의 스트림으로
        System.out.println();
        List<String> list01 = Arrays.asList("Hello World", "Java stream");

        //flatmap의 규칙!! 스트림의 형태로 결과가 반환되도록 처리해야 됨.  Arrays.stream(...)
        list01.stream()
                .flatMap(x->Arrays.stream(x.split(" ")))
                .forEach(x-> System.out.print(x+" "));
        System.out.println();


    }
}
