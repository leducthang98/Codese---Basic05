/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12.controller;

import lesson12.database.StudentDB;
import lesson12.models.Student;

/**
 *
 * @author thiennd
 */
public class StudentController {  // Single-ton Design Pattern

    private static StudentController instance;

    public static StudentController getInstance() {
        if (instance == null) {
            instance = new StudentController();
        }
        return instance;
    }

    private StudentController() {

    }

    StudentDB studentdb; // File 

    public void setStudentDB(StudentDB db) {
        this.studentdb = db;
    }

    public void createStudent(int id, String name) {
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        studentdb.create(s);
    }

    public Student readStudent(int id) {
        return studentdb.read(id);
    }

}
