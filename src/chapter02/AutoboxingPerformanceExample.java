package chapter02;

public class AutoboxingPerformanceExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Integer sum1 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum1 += i;
        }
        System.out.println("Integer : "+(System.currentTimeMillis()-start)+"ms");

        start = System.currentTimeMillis();
        int sum2 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum2 += i;
        }
        System.out.println("Integer : "+(System.currentTimeMillis()-start)+"ms");

    }
}
