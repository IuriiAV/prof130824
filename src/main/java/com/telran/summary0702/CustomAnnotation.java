package com.telran.summary0702;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface CustomAnnotation {

    //String value();

    String value() default "";

    String nums() default "";
}
