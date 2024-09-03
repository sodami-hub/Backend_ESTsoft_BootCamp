package day03.daily_quiz;

public class Quiz {
    public static void main(String[] args) {

        // Q2-2
        int number = 10;

        int result1 = number + 1;
        int result2 = number++;
        int result3 = number;
        int result4 = --number;

        System.out.println(result1); // 11
        System.out.println(result2); // 10
        System.out.println(result3); // 11
        System.out.println(result4); // 10


        //Q2-3
        int num1 = 5;
        int num2 = 7;

        System.out.println((num1 > 5) && (num2 > 5)); // false
        System.out.println((num1 > 5) || (num2 > 5)); // true
        System.out.println(!((num1 > 5) && (num2 > 5))); // true

        //Q3 - i는 2의 배수 또는 3의 배수이다.
        for(int i = 1; i<=100; i++) {
            if(i%2==0 | i%3==0) {
                System.out.print(i+" ");
            }
        }

        //Q5-1 ~ Q5-3 : 프로그래머스 풀이 완료
    }
}
