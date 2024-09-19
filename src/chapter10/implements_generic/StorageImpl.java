package chapter10.implements_generic;

public class StorageImpl<T> implements Storage<T> {
    private T[] array;

    StorageImpl(int capacity) {
        array = (T[])(new Object[capacity]);
    }

    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
