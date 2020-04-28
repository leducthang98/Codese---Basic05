/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12.database;

import java.util.ArrayList;
import lesson12.models.Student;

/**
 *
 * @author thiennd
 */
public class StudentFile implements StudentDB {

    ArrayList<Student> listStudent;

    public StudentFile() {
        listStudent = new ArrayList<>();
        Student s1, s2, s3;

        s1 = new Student();
        s1.setId(10);
        s1.setName("muoi");

        s2 = new Student();
        s2.setId(20);
        s2.setName("muoi");

        s3 = new Student();
        s3.setId(30);
        s3.setName("muoi");

        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);

    }

    @Override
    public void create(Student s) {
        listStudent.add(s);
        System.out.println("Student file create");
        System.out.println(s);
    }

    @Override
    public Student read(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                return listStudent.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(Student s) {

    }

    @Override
    public void delete(Student s) {

    }

}
