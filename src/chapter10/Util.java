package chapter10;


// 클래스에 제네릭타입 선언이 없으면 메소드에 접근제한자 다음에 넣어줘야 된다.
// 클래스 선언에 타입 선언이 있으면 메소드에 타입선언이 없어도 된다.
public class Util {
    public <T> GenBox<T> boxing(T t) {
        GenBox<T> gb = new GenBox<>();
        gb.setObj(t);
        Integer a;
        return gb;
    }
}
