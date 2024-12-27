package com.telran.homeworks.homework4_Tasks.uni;

public class UniApp {
        //create Uni with 10 students
        // print all students
        // add 3 students (1 duplicate)
        //print all students(12 students)
        //remove 2 students
        //print all students(10)
        //print black list students(2)
        //upgrade rate
        //print all students(10)

        public static void main(String[] args) {
                University university = new University();


                System.out.println("Initial students:");
                for (Student student : university.getStudents()) {
                        System.out.println(student);
                }

                // add 3 students (1 duplicate)
                Student student11 = new Student("Student11", 21, 4.0);
                student11.addPhoneNumber(new PhoneNumber("+1", "987654321"));
                university.addStudent(student11);

                Student student12 = new Student("Student12", 22, 4.5);
                student12.addPhoneNumber(new PhoneNumber("+2", "111222333"));
                university.addStudent(student12);

                Student duplicateStudent = new Student("Student1", 19, 4.0);
                duplicateStudent.addPhoneNumber(new PhoneNumber("+1", "1234561"));
                university.addStudent(duplicateStudent);

                // print all students after adding
                System.out.println("\nStudents after adding:");
                for (Student student : university.getStudents()) {
                        System.out.println(student);
                }

                // remove 2 students
                university.removeStudent(student11);
                university.removeStudent(student12);


                // Print all students after remove
                System.out.println("\nStudents after remove:");
                for (Student student : university.getStudents()) {
                        System.out.println(student);
                }

                //print black list students(2)
                System.out.println("\nBlacklisted students:");
                for (Student student : university.getBlackList()) {
                        System.out.println(student);
                }

                university.removeStudent((duplicateStudent));
                // upgrade rates
                university.upgradeRates();

                //print all students(10)
                System.out.println("\nStudents after rate upgrade:");
                for (Student student : university.getStudents()) {
                        System.out.println(student);
                }
        }
}