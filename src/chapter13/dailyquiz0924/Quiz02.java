package chapter13.dailyquiz0924;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];


        // 코드 작성
        for(int i = 0; i< array1.length; i++) {
            result[i] = array1[i];
        }
        for(int i = array1.length; i< result.length;i++) {
            result[i] = array2[i-array1.length];
        }
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        Quiz02 ascendingSort = new Quiz02();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}
