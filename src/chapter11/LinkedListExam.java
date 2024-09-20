package chapter11;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("lee");
        list.add("kim");
        list.add("park");
        list.add("jung");
        list.add("shin");

        for(int i =0; i<list.size(); i++) {
            System.out.println(i + " : "+list.get(i));
        }

        list.remove("kim");

        for (String s : list) {
            System.out.print(s+ " ");
        }

    }
}
