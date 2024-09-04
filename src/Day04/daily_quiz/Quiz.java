package Day04.daily_quiz;

import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {

        System.out.println("===== Q01 =====");
        // Q01
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[2][3];

        for(int i = 0; i<a.length; i++) {
            for(int j= 0; j<a[i].length; j++) {
                b[i][j] = a[i][j];
            }
        }
        Arrays.stream(b).forEach(arr -> System.out.println(Arrays.toString(arr)));

        // Q02
        System.out.println("===== Q02 =====");
        // for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.
        int[] array = {12, 4, 7, 20, 1};

        int max = 0;
        int sum = 0;

        for(int num : array) {
            if(num>max){
                max=num;
            }
            sum+=num;
        }
        double avg=sum/(double)array.length;
        // 결과 출력 (최대값: max, 평균: avg)
        System.out.println(max);
        System.out.println(avg);

        Arrays.stream(array).average().getAsDouble();

        // 프로그래머스 완료

    }
}
