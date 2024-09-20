package chapter11.stack;

public class Coin {
    private int value;

    public Coin(int value) {
        this.value=value;
    }

    public int get() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
