package chapter13.filtering.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test04 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice",30),
                new Person("Bob",25),
                new Person("Charlie",28)
        );
        
        String[] names;
        //people 객체의 이름만 출력
        names = people.stream()
                .map(x->x.name)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(names));

        //people 객체에서 나이가 28이상인 사람만 출력
        names = people.stream()
                .filter(x->x.age>=28)
                .map(x->x.name)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(names));

    }
}
