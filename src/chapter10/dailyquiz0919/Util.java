package chapter10.dailyquiz0919;

public class Util {

    // method 의 매개변수의 타입을 제한하고 싶다면
    public static <E extends Pair> Integer getValue(E pair, String name) {
        if(pair.getKey().equals(name)) {
            return (Integer)pair.getValue();
        }else {
            return null;
        }
    }

    // pair의 매개변수의 파라미터를 제한하고 싶다면
    /*
    public static <V> void getvvv(Pair<? extends Number, V> pair) {

    }
    */

}
