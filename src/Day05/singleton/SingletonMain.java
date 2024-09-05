package Day05.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonExam singleton = SingletonExam.singleton();
        singleton.count= 10;
        System.out.println(singleton.count);

        SingletonExam singleton2 = SingletonExam.singleton();
        System.out.println(singleton2.count);
    }
}
