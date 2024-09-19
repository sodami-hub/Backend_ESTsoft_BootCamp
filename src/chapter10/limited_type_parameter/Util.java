package chapter10.limited_type_parameter;

public class Util {
    // 타입 T 는 추상클래스 Number를 상속받는 타입으로 제한됨.
    public static <T extends Number> int compare(T t1, T t2) {
        double num1 = t1.doubleValue();
        double num2 = t2.doubleValue();
        return Double.compare(num1,num2);
    }

    public static void main(String[] args) {
        int res = compare(0.123,0.01);
        System.out.println("res = " + res);
    }
}
