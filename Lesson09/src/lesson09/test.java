/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson09;

import java.io.File;

/**
 *
 * @author Wind
 */
public class test {
    public static void main(String[] args) {
        File f = new File("students\\20168497.txt");
        System.out.println(f.exists());
        System.out.println(f.delete());
    }
}
