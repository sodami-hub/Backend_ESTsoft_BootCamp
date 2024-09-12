package Day09.exception_inherit;

import java.io.FileNotFoundException;
import java.io.IOException;

// 부모메소드의 예외보다 동일하거나 아랫단계의 메소드여야 됨.
// 런타임 익셉션은 상관없다.

public class Child extends Parent{
    @Override
    public void method01() throws FileNotFoundException {

    }
}
