package chapter13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws IOException {
        // 1. 컬렉션으로 스트림 객체 생성
        List<String> list = Arrays.asList("1","2","3","4");
        Stream<String> stringStream = list.stream();

        // 2. 배열로 스트림 생성
        String[] array = {"a","b","c","d"};
        stringStream = Arrays.stream(array);

        //3. 숫자 범위 스트림 생성
        IntStream intStream = IntStream.range(1,5); // [1,2,3,4]
        intStream = IntStream.rangeClosed(1,5); // [1,2,3,4,5]

        //4. 파일을 통한 스트림 생성
        Stream<String> fileStream = Files.lines(Paths.get("file.txt"), StandardCharsets.UTF_8);
        fileStream.forEach(System.out::println);

        //5. 스트림 연결해서 하나의 스트림으로 만들기
        Stream<Integer> intStream01 = Stream.of(1,2,3,4,5);
        Stream<Integer> intStream02 = Stream.of(6,7,8,9);

        Stream<Integer> concatStream = Stream.concat(intStream02,intStream01);

        concatStream.forEach(System.out::print);

    }
}
