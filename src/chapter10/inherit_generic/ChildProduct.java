package chapter10.inherit_generic;

public class ChildProduct<K,M,C> extends Product<K,M> {
    private C company;

    ChildProduct(K kind, M model,C company) {
        super(kind,model);
        this.company = company;
    }

    public C getCompany() {
        return this.company;
    }
}
