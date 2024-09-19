package chapter09;

public class TestAutoClose implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("call close() method");
    }


    public static void main(String[] args) {
        try(TestAutoClose close = new TestAutoClose()) {
            throw new Exception("exception");
        }catch(Exception e) {
            System.out.println("1");
            e.printStackTrace();
        }finally {
            System.out.println("2");
        }
    }
}
