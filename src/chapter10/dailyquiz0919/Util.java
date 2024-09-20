package chapter10.dailyquiz0919;

public class Util {

    // method 의 매개변수의 타입을 제한하고 싶다면
    public static <T extends Pair<K,V>, K, V> V getValue(T pair , K k) {
        if(pair.getKey().equals(k)) {
            return pair.getValue();
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
