package chapter04;

public class ArgumentArrayExample {
    public static void main(String[] args) {
        for(int i =0; i<args.length; i++){
            System.out.print(args[i]+" ");
        }
        System.out.println();
        for(String arg : args) {
            System.out.print( arg+" ");
        }
    }
}
