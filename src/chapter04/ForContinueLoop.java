package chapter04;

public class ForContinueLoop {
    public static void main(String[] args) {
        for(int i=1; i<=60; i++) {
            if(i%3!=0) {
                continue;
            }else {
                System.out.print(i+" ");
            }

        }
    }
}
