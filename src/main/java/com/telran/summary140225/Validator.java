package com.telran.summary140225;

import java.lang.reflect.Field;

public class Validator {

    public void validate(Student student) throws Exception {
        Class<? extends Student> clazz = student.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(NotEmpty.class)) {
                field.setAccessible(true);
                String o = (String) field.get(student);

                NotEmpty annotation = field.getAnnotation(NotEmpty.class);

                if (o == null && annotation.skip() != Skip.SKIP_NUll) {
                    throw new ValidateException("Field " + student + " " + field.getName() + " is null");
                }
                if (o.equals("") && annotation.skip() != Skip.SKIP_EMPTY) {
                    throw new ValidateException("Field " + student + " " + field.getName() + " is empty");
                }
            }
        }
    }
}