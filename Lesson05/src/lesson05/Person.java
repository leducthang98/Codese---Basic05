/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05;

/**
 *
 * @author Wind
 */
class Person {

    // public, private
    // Thuoc tinh (Bien)
    private String name; //getter setter
    private int age;//getter setter
    private int salary = 1000; // getter

    public Person() {
        System.out.println("Person initalize!");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phuong thuc(Ham)
    void showInfo() {
        System.out.println("Info: " + this.name + ", " + this.age);
        System.out.println("Luong: " + salary);
    }

    public String getName() {
        return this.name;
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

    public int getSalary() {
        return salary;
    }


    // class :  (Cat, Dog, Fish) => non-wings-animal => animals
    // class : (Bird, fly, dragon) => wings-animal
    // Scanner , Random, Math, Arraylist, String, Integer =>...=>.... =>.... => Object
    // extends, super, abstract, interface, impliments,override, overload,....
    // .exe class: JFrame
    // Java Core => Java Spring/ Hybernate, Socket...
    // player, enemy => chess
    //
}
