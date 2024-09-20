package chapter11;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

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
