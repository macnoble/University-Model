package com.turntabl;

import java.util.List;

public class Course {
    private Lecturer lecturer;
    private String subjectYear;
    private List<Student> studentList;

    public Course(Lecturer lecturer, String subjectYear, List<Student> studentList) {
        this.lecturer = lecturer;
        this.subjectYear = subjectYear;
        this.studentList = studentList;
    }

    public Course(Lecturer programmingLecturer, List<Student> studentArrayList, StudentYear freshman) {
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public String getSubjectYear() {
        return subjectYear;
    }

    public void setSubjectYear(String subjectYear) {
        this.subjectYear = subjectYear;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "lecturer=" + lecturer +
                ", subjectYear='" + subjectYear + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
