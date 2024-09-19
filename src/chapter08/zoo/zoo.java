package chapter08.zoo;

public class zoo {
    public static void main(String[] args) {
        ZooKeeper zk = new ZooKeeper();

        Tiger t= new Tiger();
        Lion l = new Lion();

        zk.feed(l);
        zk.feed(t);
    }
}
