package Day09;

public class UserCreateException {

    public static class UserException extends Exception {
        public UserException() {
            super("예외발생");
        }

        public UserException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            throw new UserException();  // 만약 UserException을 RuntimeException으로 정의하면 빨간줄이 생기지 않음(컴파일오류 아님)
        } catch(UserException e){
            System.out.println(e.getMessage());
        }
    }
}
