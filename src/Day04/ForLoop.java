package Day04;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <=50; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1; i <=50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
