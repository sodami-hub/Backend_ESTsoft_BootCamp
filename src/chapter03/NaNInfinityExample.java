package chapter03;

public class NaNInfinityExample {
    public static void main(String[] args) {
        double a =10;
        double b =0;

        System.out.println(Double.isInfinite(a/b));
        System.out.println(Double.isNaN(a%b));
    }
}
