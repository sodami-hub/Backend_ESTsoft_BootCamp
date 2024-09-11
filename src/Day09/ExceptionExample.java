package Day09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            String path = ExceptionExample.class.getResource("").getPath() + "/text.txt";

//            System.out.println("aaa :" + System.getProperty("user.dir"));

            BufferedReader reader = new BufferedReader(new FileReader(path));
            String result;
            while (true) {
                result = reader.readLine();
                if (result == null) {
                    break;
                }
                System.out.println(result);
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
