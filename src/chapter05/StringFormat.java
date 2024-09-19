package chapter05;

public class StringFormat{
    public static void main(String[] args) {
        String str = "...........%s.............특정문자%s사이값";

        System.out.println(String.format(str, "Hello", "Java"));
    }
}
