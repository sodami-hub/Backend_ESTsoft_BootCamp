package Day04;

public class ForDupulicateLoop {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++) {
            for(int j=2; j<=9; j++) {
                System.out.printf("%4d *%3d = %3d",j,i,j*i);
            }
            System.out.println();
        }
    }
}
