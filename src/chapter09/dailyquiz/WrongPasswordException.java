package chapter09.dailyquiz;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        super("패스워드가 틀립니다.");
    }

    public WrongPasswordException(String message) {
        super();
    }
}
