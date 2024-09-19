package chapter07.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})  // 어노테이션의 적용 범위.
public @interface AnnotationName {
    String elementNameOne();
    int elementNameTwo() default 5;
}
