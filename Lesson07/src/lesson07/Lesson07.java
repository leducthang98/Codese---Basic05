/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class Lesson07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement stdMng = new StudentManagement();
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
                    System.out.println("Nhap diem Toan, Van, Anh:");
                    int toan = sc.nextInt();
                    int van = sc.nextInt();
                    int anh = sc.nextInt();
                    sc.nextLine();
                    Student s = new Student(MSSV, name, age, toan, van, anh);
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
                        System.out.println("Student not exist!");
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
