package org.example.Project_16.OOP4.Service;

import Model.Student;
import Model.User;

import java.util.List;

public interface StudentService<T extends User> {
    void add(Student student);

    void remove(Student student);

    void edit(Student student);

    List getAllStudents();

}
