package chapter10.dailyquiz0919;

public class UtilExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("삼길동", 20);
        Integer childAge = Util.getValue(childPair, "이길동");
        System.out.println(childAge);
    }
}
