/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07;

import java.util.ArrayList;

/**
 *
 * @author Wind
 */
public class StudentManagement {

    
    //a b
    ArrayList<Student> studentMng = new ArrayList<>();
    ArrayList<Student> studentSortedByGrade = new ArrayList<>();

    // add, del, read
    public boolean addStudent(Student s) {
        for (int i = 0; i < studentMng.size(); i++) {
            if (studentMng.get(i).getMSSV().equals(s.getMSSV())) {
                return false;
            }
        }
        studentMng.add(s);
        return true;
    }

    public boolean deleteStudent(String MSSV) {
        int index = -1;
        for (int i = 0; i < studentMng.size(); i++) {
            if (studentMng.get(i).getMSSV().equals(MSSV)) {
                index = i;
            }
        }
        if (index < 0) {
            return false;
        } else {
            studentMng.remove(index);
            return true;
        }
    }

    public void showStudents() {
        for (int i = 0; i < studentMng.size(); i++) {
            studentMng.get(i).showInfo();
        }
    }

    public void topStudents() {
        studentSortedByGrade = (ArrayList<Student>)studentMng.clone(); // Class =Object => (ArrayList<Student>) => ArrayList
        for (int i = 0; i < studentSortedByGrade.size() - 1; i++) {  //bubble sort
            for (int j = i + 1; j < studentSortedByGrade.size(); j++) {
                if (studentSortedByGrade.get(i).getGrade() < studentSortedByGrade.get(j).getGrade()) {
                    Student temp = studentSortedByGrade.get(i);
                    studentSortedByGrade.set(i, studentSortedByGrade.get(j));
                    studentSortedByGrade.set(j, temp);
                }
            }
        }
        for (int i = 0; i < studentSortedByGrade.size(); i++) {
            if (i == 10) {
                break;
            }
            studentSortedByGrade.get(i).showInfo();
        }
    }
}
