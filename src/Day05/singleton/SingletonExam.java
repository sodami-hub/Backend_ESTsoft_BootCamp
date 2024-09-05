package Day05.singleton;

public class SingletonExam {

    private static SingletonExam singleton = new SingletonExam();
    int count = 1;

    public static SingletonExam singleton() {
        return singleton;
    }

    private SingletonExam() {

    }

}
