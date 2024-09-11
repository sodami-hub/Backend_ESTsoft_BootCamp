package Day09;

public class ThowExample {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch(Exception e) {
            System.out.println("익셉션 발생");
        }
    }
}
