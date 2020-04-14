/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class Lesson09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StudentManagement stdMng = new StudentManagement();
        stdMng.updateDataFromFileToArray("students");
        while (true) {
            System.out.println("1.Show Student");
            System.out.println("2.Add Student");
            System.out.println("3.Delete Student");
            System.out.println("4.Top Students");
            System.out.println("5.Exit");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    stdMng.showStudents();
                    break;
                case 2:
                    System.out.println("Nhap MSSV:");
                    String MSSV = sc.nextLine();
                    System.out.println("Nhap ten:");
                    String name = sc.nextLine();
                    System.out.println("Nhap tuoi:");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap gioi tinh:");
                    String sex = sc.nextLine();
                    System.out.println("Nhap diem Toan, Van, Anh:");
                    int toan = sc.nextInt();
                    int van = sc.nextInt();
                    int anh = sc.nextInt();
                    sc.nextLine();
                    double CPA = (toan + van + anh) / 3;
                    Student s = new Student(MSSV, name, age, toan, van, anh, CPA, sex);
                    if (stdMng.addStudent(s)) {
                        System.out.println("Success!");
                    } else {
                        System.out.println("Fail!");
                    }
                    break;
                case 3:
                    System.out.println("Nhap MSSV muon xoa:");
                    String mssvDel = sc.nextLine();
                    if (stdMng.deleteStudent(mssvDel)) {
                        System.out.println("Deleted!");
                    } else {
                        System.out.println("Delete fail");
                    }
                    break;
                case 4:
                    stdMng.topStudents();
                    break;
                case 5:
                    return;

            }

        }

    }
}
