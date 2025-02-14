package com.telran.summary9;

import java.lang.reflect.Field;

public class Validator {

    public void validate(Student student) throws IllegalAccessException {

        Class<? extends Student> clazz = student.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field: declaredFields){
            if (field.isAnnotationPresent(NonEmpty.class)){
                field.setAccessible(true);
                String o = (String) field.get(student);

                NonEmpty annotation = field.getAnnotation(NonEmpty.class);

                if (o == null && annotation.skip() != Skip.SKIP_NULL){
                    throw new ValidateException("Field " + student + " " + field.getName() + " is null");
                }
                if ( o.equals("") && annotation.skip() != Skip.SKIP_EMPTY){
                    throw new ValidateException("Field " + student + " " + field.getName() + " is empty");
                }
            }
        }
    }

}
