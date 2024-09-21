package weekly_quiz_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressBookExamMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addr = new AddressBook();
        String selecNum;
        String name;
        String phoneNum;
        String company;
        String relation;
        while(true) {

            System.out.println("1. 비지니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요 > ");

            selecNum = sc.next();

            switch(selecNum) {
                case "1":
                    System.out.print("이름을 입력하세요 :");
                    name = sc.next();
                    System.out.print("전화번호를 입력하세요 :");
                    phoneNum = sc.next();
                    System.out.print("회사명을 입력하세요 :");
                    company = sc.next();
                    addr.addAddress(new BusinessContact(name,phoneNum,company));
                    break;
                case "2":
                    System.out.print("이름을 입력하세요 : ");
                    name = sc.next();
                    System.out.print("전화번호를 입력하세요 :");
                    phoneNum = sc.next();
                    System.out.print("관계를 입력하세요 :");
                    relation = sc.next();
                    addr.addAddress(new PersonalContact(name,phoneNum,relation));
                    break;
                case "3":
                    addr.displayContacts();
                    break;
                case "4":
                    System.out.print("검색할 이름을 입력하세요 : ");
                    name = sc.next();
                    addr.searchContact(name);
                    break;
                case "5":
                    break;
                default:
                    System.out.println("다시 입력하세요.");
                    break;
            }

            if(selecNum.equals("5")){
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
