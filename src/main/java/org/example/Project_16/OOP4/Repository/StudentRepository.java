package org.example.Project_16.OOP4.Repository;

import Model.Student;

import java.io.FileWriter;
import java.util.List;

public class StudentRepository {
    public void save(Student student){
        try(FileWriter fileWriter = new FileWriter("students.txt")){
            fileWriter.write(student.toString());
            fileWriter.flush();

        }catch (Exception exception){}
    }
    public void remove(Student student){}

    public void edit(Student student){}
    public void read(Student student){}

    public List getAllStudents(){
        return null;
    }
}
