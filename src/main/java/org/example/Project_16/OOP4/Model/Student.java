package org.example.Project_16.OOP4.Model;

import java.util.List;
import java.util.Objects;

public class Student extends User {
    private String name;
    private float grade;
    private int year;
    private int school;

    public Student(String name, float grade, int year) {
        this.name = name;
        this.grade = grade;
        this.year = year;
        this.school = school;
    }

    private Teacher teacher;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.grade, grade) == 0 && year == student.year && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, year, school);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", year=" + year +
                ", teacher=" + teacher +
                ", school=" + school +
                '}';
    }
}
