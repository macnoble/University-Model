package com.turntabl;

public class Lecturer {
    private String name;
    private Subject course;

    public Lecturer(String name, Subject course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getCourse() {
        return course;
    }

    public void setCourse(Subject course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
