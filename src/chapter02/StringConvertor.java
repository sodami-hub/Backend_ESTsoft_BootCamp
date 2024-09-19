package chapter02;

public class StringConvertor {
    public static void main(String[] args) {
        //String -> 숫자.

        String str = "12345";
        int num = Integer.parseInt(str);
        Integer num2 = Integer.valueOf(str);

        System.out.println("num1 = "+ num + "// num2 = " + num2);

        String value = "10000.345";
        double num3 = Double.parseDouble(value);
        float num4 = Float.parseFloat(value);
        System.out.println("num3 = "+ num3 + "// num4 = " + num4);

        int intVal = 123450909;
        long longVal = 12345L;
        double doubleVal = 12345.0;

        String strVal = String.valueOf(intVal);
        System.out.println("strVal = " + strVal);
        strVal = Long.toString(longVal);
        System.out.println("strVal = " + strVal);
        strVal = Double.toString(doubleVal);
        System.out.println("strVal = " + strVal);

        float floatVal = 12345.011f;
        strVal = ""+floatVal;
        System.out.println("strVal = " + strVal);



    }
}
