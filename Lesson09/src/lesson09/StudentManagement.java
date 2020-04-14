/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
    File folderStudent = new File("students");

    // add, del, read
    public boolean addStudent(Student s) throws IOException {
        // 20168497 LeDucThang 21 nam 8 8 8 8
        File f = new File(folderStudent.getName() + "\\" + s.getMSSV() + ".txt");
        if (f.exists()) {
            return false;
        } else {
            f.createNewFile(); // Le Duc Thang:21:nam:8,8,8
            String dataInput = s.getName() + ":" + s.getAge() + ":" + s.getSex() + ":" + s.getMathGrade() + "," + s.getLiterGrade() + "," + s.getEngGrade();
            FileWriter fw = new FileWriter(f);
            fw.write(dataInput);
            fw.close();
            this.updateDataFromFileToArray(folderStudent.getName());
            return true;
        }
    }

    public boolean deleteStudent(String MSSV) throws IOException {
        File f = new File(folderStudent.getPath() + "\\" + MSSV + ".txt");
        boolean result = f.delete();
        return result;
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

    public void updateDataFromFileToArray(String folderName) throws IOException {
        studentMng.clear();
        File f = new File(folderName);
        File[] listFile = f.listFiles();
        for (int i = 0; i < listFile.length; i++) {
            String Filename = listFile[i].getName(); // => MSSV
            String MSSV = Filename.replaceAll(".txt", "");
            String dataReadFromFile;
            String dataSplited[] = new String[4]; // => 0,1,2 Name, age, sex
            int count = 0;
            FileReader fr = new FileReader(listFile[i]);
            BufferedReader bf = new BufferedReader(fr);
            dataReadFromFile = bf.readLine(); // name age sex grade
            for (String initData : dataReadFromFile.split(":")) {
                dataSplited[count] = initData;
                count++;
            }// name age sex grade:8,8,8
            count = 0;
            double grades[] = new double[3]; // => grades
            for (String grade : dataSplited[3].split(",")) {
                grades[count] = Double.parseDouble(grade);
                count++;
            }
            double CPA = (grades[0] + grades[1] + grades[2]) / 3;
            Student s = new Student(MSSV, dataSplited[0], Integer.parseInt(dataSplited[1]), grades[0], grades[1], grades[2], CPA, dataSplited[2]);
            studentMng.add(s);

        }
    }

}
