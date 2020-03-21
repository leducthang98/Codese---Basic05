/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

/**
 *
 * @author Wind
 */
public class Person {

    static String type = "Nguoi";
    boolean brain = true;
    int hands;
    int legs;
    int eyes;
    boolean isMale; // bien thuoc Object

    public static void main(String[] args) {
        Person Thang = new Person();
        Thang.eyes = 2;
        Thang.hands = 2;
        Thang.legs = 2;
        Thang.isMale = true;

        
        Person Thao = new Person();
        Thao.eyes = 2;
        Thao.hands = 1;
        Thao.legs = 2;
        Thao.isMale = false;

        System.out.println(Person.type);

    }

}
