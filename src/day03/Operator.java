package day03;

import org.w3c.dom.ls.LSOutput;

public class Operator {
    public static void main(String[] args) {
        //단항연산자
        int x = 14;
        int result = --x;
        System.out.println("result = " + result);
        System.out.println("x : " + x);

        // 문자열 연산(왼쪽에서 오른쪽으로 연산 진행
        System.out.println("hello" + 123 + 123);
        System.out.println(123 + 123 + "hello");

        //삼항 연산자

        int num = 23;
        String re = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println("re = " + re);

        int a = 2;
        int b = 2;
        int max = (a >= b) ? a : b;
    }
}
