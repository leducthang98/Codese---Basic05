/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12.models;

/**
 *
 * @author thiennd
 */
public class Student {

    private int id;
    private String name;
    private int age;
    private double GPA, mathGrade, literGrade, engGrade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
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

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", GPA=" + GPA + ", mathGrade=" + mathGrade + ", literGrade=" + literGrade + ", engGrade=" + engGrade + '}' + '\n';
    }

}
