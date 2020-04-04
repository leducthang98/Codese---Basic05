/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07;

/**
 *
 * @author Wind
 */
public class Student {

    //student => MSSV, Ten, Tuoi, DiemThi[ Toan, Van, Anh ] ; Arraylist => CRD create, read , update, delete
    private String MSSV, name;
    private int age;
    private double mathGrade, literGrade, engGrade;
    private double grade;

    public Student() {
    }

    public String getMSSV() {
        return MSSV;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getLiterGrade() {
        return literGrade;
    }

    public void setLiterGrade(double literGrade) {
        this.literGrade = literGrade;
    }

    public double getEngGrade() {
        return engGrade;
    }

    public void setEngGrade(double engGrade) {
        this.engGrade = engGrade;
    }

    public Student(String MSSV, String name, int age, double mathGrade, double literGrade, double engGrade) {
        this.MSSV = MSSV;
        this.name = name;
        this.age = age;
        this.mathGrade = mathGrade;
        this.literGrade = literGrade;
        this.engGrade = engGrade;
        this.grade = (this.mathGrade + this.literGrade + this.engGrade) / 3;
    }

    void showInfo() {
        System.out.println("MSSV: " + this.MSSV + " name: " + this.name + " age: " + this.age + " CPA: " + this.grade);
    }

}
