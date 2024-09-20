package chapter11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("홍",10);
        map.put("길",12);
        map.put("동",15);
        map.put("메",25);
        map.put("롱",25);

        //
        System.out.println(map.get("이"));  // null
        System.out.println(map.getOrDefault("이",0)); // key가 없는 경우에 default값 세팅



        // Iterator에 엔트리를 불러와서 출력해보기
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        //Iterator에 key를 불러와서 출력
        iter = map.keySet().iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        //Iterator의 key 값으로 map의 value를 불러오기 {key : value} 로 출력.
        iter = map.keySet().iterator();
        String key;
        while(iter.hasNext()) {
            key = (String)iter.next();
            System.out.print("{"+key+" : "+map.get(key)+"}  " );
        }
        System.out.println("\n");


        // Iterator로 value 값만 출력해보기
        iter = map.values().iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }


        // Map의 엔트리를 Set에 넣기.
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        iter = entrySet.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next()+ " ");
        }

    }
}
