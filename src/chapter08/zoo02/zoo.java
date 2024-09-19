package chapter08.zoo02;


public class zoo {
    public static void main(String[] args) {
        ZooKeeper zk = new ZooKeeper();
        Lion l = new Lion();
        Tiger t = new Tiger();

        zk.feed(l);
        zk.feed(t);


    }
}
