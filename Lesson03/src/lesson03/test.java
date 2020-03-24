/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class test {

    public static void main(String[] args) {
        int[] a;
        a = nhapMang();
        xuatMang(a);
    }

    static int[] nhapMang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        int spt = sc.nextInt();
        int[] a = new int[spt];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhap pt thu" + i);
            a[i] = sc.nextInt();
        }
        return a;
    }

    static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
