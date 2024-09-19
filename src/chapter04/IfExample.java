package chapter04;

public class IfExample {
    public static void main(String[] args) {

        // args parameter로 실행해보기.
        int score= Integer.parseInt(args[0]);
        System.out.println("score = " + score);
        char grade = ' ';

        if(score >= 90) {
            grade ='A';
        } else if(score >= 80) {
            grade = 'B';
        } else if(score >= 70) {
            grade = 'C';
        }else {
            grade = 'D';
        }

        System.out.println(grade);
    }
}
