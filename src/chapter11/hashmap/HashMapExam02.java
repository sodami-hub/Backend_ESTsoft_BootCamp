package chapter11.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExam02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("spring", "qwer");
        map.put("summer", "qwer1234");
        map.put("fall", "qwer123");
        map.put("winter", "qwe123");

        Scanner sc = new Scanner(System.in);
        String id;
        String pw;
        while(true) {
            System.out.print("id를 입력하세요 > ");
            id = sc.nextLine();
            System.out.print("비밀번호를 입력하세요 > ");
            pw = sc.nextLine();

            if(map.containsKey(id)) {
                if(pw.equals(map.get(id))) {
                    System.out.println("로그인 성공");
                    break;
                } else {
                    System.out.println("비밀번호가 틀렸다.");
                    continue;
                }
            }
            System.out.println("없는 아이디입니다.");
        }
    }
}
