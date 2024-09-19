package chapter03;

import static java.lang.Integer.toBinaryString;

public class BitOperator {
    public static void main(String[] args) {
        int x = 15;
        int y = 30;

        System.out.println("x : " + x + " " + toBinaryString(x));
        System.out.println("y : " + y + " " + toBinaryString(y));
        System.out.println("x&y : " + (x & y) + " " + toBinaryString(x & y));

        int z = -8;
        System.out.println();
        System.out.println(z >>> 2);


        int k = z >>> 2;
        System.out.println("k = " + k);
        System.out.println("z>>2 : " + (z >> 2) + " " + toBinaryString(z >> 2));  //  오른쪽으로 이동 빈자리는 부호 비트와 동일한 값으로 채워짐
        System.out.println("z>>>2 : " + (z >>> 2) + " " + toBinaryString(z >>> 2)); // 빈자리는 무조건 0으로 채워짐(-값이 +로 바뀌면서 값이 엄청 커질 수 있다.)
        System.out.println("x>>>2 : " + (x >>> 2) + " " + toBinaryString(x >>> 2));  //
        System.out.println("y<<2 : " + (y << 2) + " " + toBinaryString(y << 2)); // 밀려난 왼쪽은 소실, 새로 채워지는 오른쪽 자리는 0으로 채워짐
    }
}
