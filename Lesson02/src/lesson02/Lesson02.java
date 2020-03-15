/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class Lesson02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao a:");
//        int a = sc.nextInt(); // so be hon
//        System.out.println("Nhap vao b:");
//        int b = sc.nextInt(); // so lon hon
//        if (a > b) {
//            int temp = a;  // temp = 10
//            a = b;         // a= 12
//            b = temp;      // b = 10
//        }
//        for (int i = a; i > 0; i--) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println("tim thay UCLN: " + i);
//                break;
//            }
//        }
//        while (true) {
//            System.out.println("Nhap vao 1 so:");
//            int a = sc.nextInt();
//            if (a == -1) {
//                break;
//            } else {
//                System.out.println("so vua nhap: " + a);
//            }
//        }
//        
//        System.out.println("Vong lap da ket thuc");
        // true false
//        int i = 1;
//        while (i < 2) {
//            System.out.println(i);
//            i++;
//        }
//        do {
//            
//            System.out.println("ok");
//            
//        } while (1 > 2);

        // Nhap vao so ngay
//        System.out.println("Nhap vao thang: ");
//        int month = sc.nextInt();
//
//        switch (month) {
//            case 1:
//                System.out.println("31 ngay");
//                break;
//            case 2:
//                System.out.println("28 ngay");
//                break;
//            case 3:
//                System.out.println("31 ngay");
//                break;
//            case 4:
//                System.out.println("30 ngay");
//                break;
//        }
//        // Scanner if else for while do while switch case operators 
//        
//        System.out.println("Nhap vao 1 so: ");
//        int a = sc.nextInt();
//        int count = 0;
//        for (int i = 2; i < a; i++) {
//            count = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            if (count == 2) {
//                System.out.println(i);
//            }
//            // check xem i co phai snt hay khong
//        }
        //
//        int dd[] = new int[100007];
//        System.out.println("Enter a prime number: ");
//        int n = sc.nextInt();
//        dd[2] = 0;
//        for (int i = 2; i < n; ++i) {
//            if (dd[i] == 0) {
//                for (int j = i + i; j < n; j += i) {
//                    dd[j] = 1;
//                }
//            }
//        }
//        for (int i = 2; i < n; ++i) {
//            if (dd[i] == 0) {
//                System.out.println(i + " ");
//            }
//        int a = 0;
//
//        int[] arr = {1, 2, 4, 6, 7, 3}; // arr[i]
//
//        arr[0] = 999;
//
//        int length = arr.length;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.println(arr[i]);
//
//        }
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Nhap pt thu " + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }

    }

}
