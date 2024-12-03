package com.telran.myLesson7.uni;

public class UniApp {

    //create Uni with 10 students
    //add 3 students (1 duplicate) -> receive a response about duplicate
    //print all students(12)
    //remove 2 students
    //print all students(10)
    //print blacklist (2)
    //update rate
    //print all students(10)

    public static void main(String[] args) {
        University university = new University();
        System.out.println("Uni is created. The size is: " + university.getStudents().size() + "\n" + university.getStudents());

        for (int i = 0; i < university.getStudents().size(); i++) {
            university.getStudents().get(i).addPhoneNumber(new PhoneNumber(375, 29332144 + i));
        }

        Student studentEleven = new Student("Mikki", 21);
        Student studentDuplicate = new Student("Peter", 21);
        Student studentTwelve = new Student("Rebeca", 19);

        university.addStudent(studentEleven);
        university.addStudent(studentDuplicate);
        university.addStudent(studentTwelve);

        System.out.println("3 students (1 duplicate) are added." +
                "The size is:  " + university.getStudents().size() + "\n" + university.getStudents());

        university.addToBlackListStudent("Peter", 21);
        university.addToBlackListStudent("Petra", 21);

        System.out.println("Uni after deleting students. " +
                "The size is: " + university.getStudents().size() + "\n" + university.getStudents());
        System.out.println("The black list is: " + university.getBlackList());

        university.upRateForStudents();

        System.out.println("Uni after updating students' rate. " +
                "The size is: " + university.getStudents().size() + "\n" + university.getStudents());
    }
}
