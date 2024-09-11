package Day09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("file"));
        reader.readLine();
        reader.close();
    }
}
