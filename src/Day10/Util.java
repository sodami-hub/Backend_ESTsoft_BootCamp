package Day10;

public class Util {
    public <T> GenBox<T> boxing(T t) {
        GenBox<T> gb = new GenBox<>();
        gb.setObj(t);
        return gb;
    }
}
