package com.telran.summary1402Validator;

import java.util.stream.Stream;

/**
 * @ NotEmpty - check if not null and not empty
 * not required param 'skip' : Enam
 * 1. @ NotEmpty
 * 2. Class Student: name, email, address (with annotation)
 * 3. Validator: validate(Student student)
 */
public class ValidatorApp {
    public static void main(String[] args) {
        Student studentOne = new Student("Max", 46, "123odin@gmail.com", "Address123");
        Student studentTwo = new Student(null, 50, "123odin@gmail.com", "Address999");
        Student studentThree = new Student("Oleg", 48, "123two@gmail.com", "");

        Validator validator = new Validator();

        Stream.of(studentOne, studentTwo, studentThree).forEach(student -> {
            try {
                validator.validate(student);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }

}
