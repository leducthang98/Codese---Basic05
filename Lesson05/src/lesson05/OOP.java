/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05;

import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class OOP {

    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.name = "Le Duc Thang";
//        person1.age = 22;
//        person1.showInfo();
//        System.out.println("-----------");
//        Person person2 = new Person();
//        person2.name = "Mai Quang Minh";
//        person2.age = 21;
//        person2.showInfo();
//        Person person1 = new Person("Le Duc Thang", 24);
//        person1.showInfo();

        //Bai tap : tao class PhanSo
//        PhanSo ps1 = new PhanSo();
//        ps1.mau = 4;
//        ps1.tu = 3;
//        ps1.show();
//        ps1.add(5);
//        ps1.show();
        Person person1 = new Person("Thang", 22);
        person1.setName("Le Duc Thang");
        System.out.println(person1.getName());
        person1.setAge(21);
        System.out.println(person1.getSalary());

    }
}
