package com.turntabl;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1, "mac", StudentYear.Freshman);
        Student student2 = new Student(2, "noble", StudentYear.Sophomore);
        Student student3 = new Student(3, "brako", StudentYear.Junior);
        Student student4 = new Student(4, "kusi", StudentYear.Senior);
        Student student5 = new Student(5, "kofi", StudentYear.Freshman);
        Student student6 = new Student(6, "kwesi", StudentYear.Sophomore);
        Student student7 = new Student(7, "kwame", StudentYear.Junior);
        Student student8 = new Student(8, "kojo", StudentYear.Senior);
        Student student9 = new Student(9, "yaw", StudentYear.Freshman);
        Student student10 = new Student(10, "yaa", StudentYear.Sophomore);
        Student student11 = new Student(11, "abena", StudentYear.Senior);
        Student student12 = new Student(12, "ama", StudentYear.Senior);
        Student student13 = new Student(13, "adwoa", StudentYear.Freshman);
        Student student14 = new Student(14, "akosua", StudentYear.Sophomore);
        Student student15 = new Student(15, "tom", StudentYear.Junior);
        Student student16 = new Student(16, "jerry", StudentYear.Senior);
        Student student17 = new Student(17, "edward", StudentYear.Freshman);
        Student student18 = new Student(18, "yoofi", StudentYear.Sophomore);
        Student student19 = new Student(19, "yawenam", StudentYear.Junior);
        Student student20 = new Student(20, "mary", StudentYear.Senior);

        List<Student> studentArrayList = List.of(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10,
                student11, student12, student13, student14, student15, student16, student17, student18, student19, student20);

        List<Student> firstYearProgrammingList = studentArrayList.stream().filter(student -> student.getYear() == StudentYear.Freshman).collect(Collectors.toList());
        List<Student> thirdFourthYearGardeningList = studentArrayList.stream().filter(student -> student.getYear() == StudentYear.Junior || student.getYear() ==StudentYear.Senior).collect(Collectors.toList());

        Lecturer ProgrammingLecturer = new Lecturer("Dr.Riyannat", Subject.Programming);
        Lecturer PhysicsLecturer = new Lecturer("Dr. Einstein",Subject.Physics);
        Course ProgrammingIntroCourse = new Course(ProgrammingLecturer, studentArrayList, StudentYear.Freshman);
        Course PhysicsForthYear = new Course(PhysicsLecturer,studentArrayList,StudentYear.Senior);

        List<Character> vowels = List.of('a','e','i','o','u');


        List<Student> physicsList = studentArrayList.stream().filter(student -> student.getYear() == StudentYear.Senior).collect(Collectors.toList());
        // List<Student> vowelStartName = physicsList.stream().filter(student -> student.getName().startsWith("a") || student.getName().startsWith("e") || student.getName().startsWith("i")|| student.getName().startsWith("o") || student.getName().startsWith("u")).collect(Collectors.toList());

        List<Student> vowelStartName = physicsList.stream().filter(student -> student.getYear() == StudentYear.Senior && vowels.contains(student.getName().toLowerCase().charAt(0))).collect(Collectors.toList());

//        System.out.println(firstYearProgrammingList);
//        System.out.println(thirdFourthYearGardeningList);
        System.out.println(vowelStartName);
    }

}
