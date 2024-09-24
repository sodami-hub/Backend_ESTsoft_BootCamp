package chapter13.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        OptionalDouble od = list.stream()
                .mapToInt(Integer::intValue)
                .average();                  // 여기까지 OptionalDouble 객체로 변경된 값. 예외가 발생하지 않음.

        double avg = od.orElse(0.0);  // orElse() 를 사용함으로 예외발생을 원천 차단함.

        System.out.println("avg = " + avg);

        od.ifPresent(x-> System.out.println("avg :" +x)); // DoubleConsumer를 사용해서 값이 있으면 출력
    }
}
