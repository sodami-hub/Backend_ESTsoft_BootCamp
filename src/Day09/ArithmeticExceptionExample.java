package Day09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int b = Integer.parseInt(args[0]);
        
        try( BufferedReader reader = new BufferedReader(new FileReader("text.text"))) {
            int result = 5/b;
            System.out.println("result = " + result); // Arithmetic Exception -> UncheckException
            System.out.println("1");
            // IOException -> CheckedException
            reader.readLine();
            System.out.println("2");
        } catch (ArithmeticException | IOException e) {
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("Exception 발생");
            System.out.println("4");
        }finally {
            System.out.println("5");
        }
    }
}
