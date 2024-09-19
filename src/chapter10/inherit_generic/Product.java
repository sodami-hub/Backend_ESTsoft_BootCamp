package chapter10.inherit_generic;

public class Product<K,M> {
    private K kind;
    private M model;

    Product(K kind, M model) {
        this.kind = kind;
        this.model = model;
    }

    public K getKind() {
        return this.kind;
    }
    public M getModel() {
        return this.model;
    }
}
