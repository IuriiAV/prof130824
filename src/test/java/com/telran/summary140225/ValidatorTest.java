package com.telran.summary140225;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

   private Validator validator = new Validator();

    @Test
    public void testValidateNullException() {
        Student studentOne = new Student(null, "123odin@gmail.com", 46, "Address123");
        assertThrows(ValidateException.class, () -> validator.validate(studentOne));
    }

    @Test
    public void testValidateIsEmpty() {
        Student studentOne = new Student("", "123odin@gmail.com", 46, "Address123");
        assertThrows(ValidateException.class, () -> validator.validate(studentOne));
    }
}