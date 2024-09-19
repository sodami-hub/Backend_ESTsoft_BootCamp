package chapter05;

public class StringExample {
    public static void main(String[] args) {
        String str ="Hello, Java";
        System.out.println("str = " + str);
        
        String replace = str.replace("Java", "melong");
        System.out.println("replace = " + replace);
        
        int index = str.indexOf("Java");
        System.out.println("index = " + index);

        String strr= str.toUpperCase();
        System.out.println("strr = " + strr);
        String strrrr= strr.toLowerCase();
        System.out.println("strrrr = " + strrrr);

        //ex01

        String a ="aaaabbccd";

        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            System.out.print(ch);
        }
        System.out.println();

        //ex02
        String b="";
        for(int i = a.length()-1; i >=0; i--){
            char ch = a.charAt(i);
            b=b+ch;
        }
        System.out.println("b = " + b);

        //ex03
        String ex03 = "   Hello Welcome Java    ";
        String res = ex03.trim().replace(" ","");
        System.out.println("res = " + res);

    
    }
}
