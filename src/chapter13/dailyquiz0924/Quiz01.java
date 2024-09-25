package chapter13.dailyquiz0924;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz01 {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

        // 코드 작성
        int value=0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                value= i;
                break;
            }
        }
        value = array[value-1];

        int finalValue = value;
        answer = Arrays.stream(array)
                .filter(x->(x> finalValue))
                .boxed()
                .toList();


        return answer;
    }

    public static void main(String[] args) {
        Quiz01 printMoreBigNumber = new Quiz01();
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 숫자의 개수 > ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        System.out.println("숫자를 "+ number +"개 입력하세요. (" +number+"를 포함해야 됨) >");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }

        scanner.close();
    }
}
