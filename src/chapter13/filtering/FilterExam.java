package chapter13.filtering;

import java.util.*;
import java.util.stream.Collectors;

/*
가공 2.
filter - 필터링...
 */


public class FilterExam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김밥","김치","김사냥","더위사냥","참치","김밥","기무치");

        // filter() 는 Predicate 함수형 메소드를 사용해서 input을 가지고 boolean을 반환한다.
        list.stream()
                .filter(x->x.startsWith("김"))
                .distinct()
                .forEach(x-> System.out.print(x+" "));  // 최종 결과물 -> 출력

        System.out.println();
        
        
        Set<String> set = new HashSet<String>();
        set = list.stream()
                .filter(x->x.startsWith("김"))
                .collect(Collectors.toSet());   // 필터링된 스트림을 Set에 저장(자동 중복 제거)

        System.out.println("set = " + set);
        
        String[] array  = {"김밥","김치","김사냥","더위사냥","참치","김밥","기무치"};
        List<String> list02 = new ArrayList<>();
        
        list02 = Arrays.stream(array).distinct().toList();
        System.out.println("list02 = " + list02);
        
        
    }
}
