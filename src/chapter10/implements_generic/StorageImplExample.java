package chapter10.implements_generic;

import java.util.ArrayList;

public class StorageImplExample {
    public static void main(String[] args) {
        StorageImpl<String>  storage = new StorageImpl(10);
        storage.add("냉장고",0);
        storage.add("텔레비전",1);
        storage.add("세탁기",2);
        
        String res = storage.get(2);
        System.out.println("res = " + res);


        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("list.toString() = " + list.toString());
    }
}
