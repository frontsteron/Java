package org.example.Project_16.OOP4.Controller;

import Model.Student;
import Service.StudentService;
import Service.impls.StudentServiceImpl;
//Контроллер
public class StudentController {
    private StudentService studentService = new StudentServiceImpl();
    public void getStudentInfo(String name, float grade, int year){
        studentService.add(new Student(name,grade,year));

    }
}
