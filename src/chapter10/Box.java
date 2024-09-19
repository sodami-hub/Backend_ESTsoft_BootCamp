package chapter10;

public class Box {
    private Object obj;

    public void set(Object obj) {
        this.obj = obj;
    }
    public Object get() {
        return this.obj;
    }



    public static void main(String[] args) {
        Box b = new Box();
        b.set("hello");
        String str =  (String)b.get();
        System.out.println(b.get());
        
        GenBox<String> gb = new GenBox<>();
        gb.setObj("world");
        String strrr = gb.getObj();
        System.out.println("strrr = " + strrr);

        Util u = new Util();
        String st ="hi";
        GenBox<String> gb01 = u.boxing(st);
        System.out.println(gb01.getObj());

        int i = 1234;
        GenBox<Integer> gb02 = u.boxing(i);
        System.out.println("gb02.getObj() = " + gb02.getObj());
    }
}
