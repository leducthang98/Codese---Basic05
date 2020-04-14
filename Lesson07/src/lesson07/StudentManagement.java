/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        File dataStudent = new File("");
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
        studentSortedByGrade = (ArrayList<Student>) studentMng.clone(); // Class =Object => (ArrayList<Student>) => ArrayList
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

    public void updateDataFromFileToArray(File f) throws IOException {
        studentMng.clear();
        for (File temp : f.listFiles()) {
            FileReader fr = null;
            try {
                String MSSV = temp.getName(); // => MSSV
                String dataReadFromFile;
                String dataSplited[] = new String[4]; // => 0,1,2 Name, age, sex
                int count = 0;
                fr = new FileReader(f);
                BufferedReader bf = new BufferedReader(fr);
                dataReadFromFile = bf.readLine(); // name age sex grade
                for (String initData : dataReadFromFile.split(":")) {
                    dataSplited[count] = initData;
                    count++;
                }
                count = 0;
                //data[3] : 8,8,8
                double grades[] = new double[3]; // => grades
                for (String grade : dataSplited[3].split(",")) {
                    grades[count] = Double.parseDouble(grade);
                }
                double CPA = (grades[0] + grades[1] + grades[2]) / 3;
                Student s = new Student(MSSV, dataSplited[0], Integer.parseInt(dataSplited[1]), grades[0], grades[1], grades[2], CPA, dataSplited[2]);
                studentMng.add(s);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(StudentManagement.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(StudentManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
    
}
