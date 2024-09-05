package Day05;

public class StringBuildBufferExample {
    public static void main(String[] args) {
        StringBuilder example = new StringBuilder("hello");
        example.append(" world");
        System.out.println("example = " + example);

        StringBuffer buffer = new StringBuffer("hi");
        buffer.append(" java");
        buffer.append(" world");
        System.out.println(buffer);

        //buffer.insert(30, "!!!");  // error!! 범위를 벗어남.
        buffer.insert(buffer.length(), "!!!"); // 마지막에 추가
        System.out.println("buffer = " + buffer);

        //Q4. 연속된 문자의 반복 횟수로 문자열 압축해보기  "aaaabbccd" -> "a4b2c2d1"

        String str = "aaaabbccd";
        String result = "";
        char temp;
        int sameCount = 1;
        result += str.charAt(0);
        for(int i = 1; i<str.length(); i++) {
            if(str.charAt(i-1) == str.charAt(i)) {
                sameCount++;
            } else {
                result += sameCount;
                result += str.charAt(i);
                sameCount=1;
            }
        }
        result +=sameCount;
        System.out.println("result = " + result);
    }
    
    
}
