/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson01;

import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class chuabai {

    public static void main(String[] args) {
        int dem = 0;
        long factorial = 1l;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so bat ki");
        long n = sc.nextLong();
        for (int i = 0; i < n; i++) {
            factorial = factorial * (n - i);
        }
        System.out.println(factorial);
        while (factorial % 10 == 0) {

            dem++;
            factorial = factorial / 10;

        }

        System.out.println("so chu so 0 " + dem);

    }

}
