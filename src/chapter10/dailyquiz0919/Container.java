package chapter10.dailyquiz0919;

public class Container<T> {
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value=value;
    }
}
