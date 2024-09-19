package chapter10.dailyquiz0919;

public class TwoContainer<K,V> {
    private K key;
    private V value;

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }
    public V getValue() {
        return this.value;
    }
}
