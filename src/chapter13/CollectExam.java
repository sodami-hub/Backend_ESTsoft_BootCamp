package chapter13;

/*
스트림의 결과단계에서 사용
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExam {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        
        List<Integer> list = Arrays.stream(array)
                .filter(x->x%2==0)
                .boxed()
                .toList();

        System.out.println("list = " + list);


        List<Integer> numbers = Arrays.asList(1,1,2,2,2,3,4,5,5,5,6,6,7,7,8,8,8,8,8);

        Map<Integer, Long> map = numbers.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));

        map.forEach((key,value) -> System.out.println(key +" : "+value));
    }
}
