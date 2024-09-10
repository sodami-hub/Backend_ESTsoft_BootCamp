package Day07.annotation;


@AnnotationName(elementNameOne = "value", elementNameTwo = 12)
public class AnnotationTest {

    @AnnotationName(elementNameOne = "val", elementNameTwo = 123)
    int field;

    @AnnotationName(elementNameOne = "value")
    String method() {
        return null;
    }
}
