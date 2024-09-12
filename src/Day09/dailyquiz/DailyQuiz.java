package Day09.dailyquiz;

public class DailyQuiz {
    public static void main(String[] args) {
        /*
        1. 4 // 사용자 정의 예외도 처리 가능하다

        2. 3 // finally 블록은 어떤 상황에서도 실행된다.

        3. 4 // 새로운 예외를 발생시키는 키워드 throw

        4. 2 // throws

        5. 3 // Exception 이 Clas.. 뒤에 나와야 됨.

        6.
        10
        숫자로 변환할 수 없음.
        10

        */

        //Q 7

        try {
            login("white","12345");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue","54321");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void login(String id, String password) throws Exception {
        if(!id.equals("blue")) {
            throw new NotExistIdException();
        }

        if(!password.equals("12345")) {
            throw new WrongPasswordException();
        }
    }
}
