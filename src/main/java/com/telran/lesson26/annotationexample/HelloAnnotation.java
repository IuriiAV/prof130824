package com.telran.lesson26.annotationexample;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Repeatable()
//@Inherited
public @interface HelloAnnotation {

    // String value();

}
