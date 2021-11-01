package com.turntabl;

public  class Student {
    private int id;
    private String name;
    private StudentYear year;

    public Student(int id, String name, StudentYear year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentYear getYear() {
        return year;
    }

    public void setYear(StudentYear year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
