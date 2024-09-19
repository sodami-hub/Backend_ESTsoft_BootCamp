package chapter09.dailyquiz;

public class NotExistIdException extends Exception{
    public NotExistIdException() {
        super("존재하지 않는 id 입니다.");
    }

    public NotExistIdException(String message) {
        super();
    }
}
