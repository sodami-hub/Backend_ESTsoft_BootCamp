package chapter11.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<Member> memset = new HashSet<>();

        Member m1 = new Member("lee",30);
        Member m2 = new Member("lee",30);
        Member m3 = new Member("kim",31);

        memset.add(m1);
        memset.add(m2);
        memset.add(m3);

        System.out.println(memset.size());
/*

        set.add("X");
        set.add("B");
        set.add("C");
        set.add("A");
        set.add("F");
        set.add("Z");
        set.add("H");
        set.add("K");
        set.add("A");

        System.out.println("size = "+set.size());
        System.out.println("향상된 for");
        for (String s : set) {
            System.out.print(s+" ");
        }
        System.out.println();

        System.out.println("Iterator with while");
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.print(str+ " ");
        }
        System.out.println();

        set.remove("Z");

        System.out.println("\nsize = "+set.size());
        System.out.println("Iterator with while");
        iter = set.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.print(str+ " ");
        }
        System.out.println();

        set.clear();

        System.out.println(set.isEmpty());
*/

    }
}
