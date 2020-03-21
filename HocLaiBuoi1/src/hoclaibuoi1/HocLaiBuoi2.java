/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoclaibuoi1;

import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class HocLaiBuoi2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao 1 so");
//        int input = sc.nextInt();
//        int count = 0;
//        if (input < 0) {
//            System.out.println("Moi nhap so duong");
//        } else {
//            for (int i = 1; i <= input; i++) {
//                if (input % i == 0) {
//                    System.out.println("Tim thay 1 uoc:" + i);
//                    count = count + 1;
//                }
//            }
//            if (count == 2) {
//                System.out.println("La SNT");
//            } else {
//                System.out.println("Khong phai");
//            }
//        }
//        int a = 5;
//        while (a > 1) {
//            System.out.println("thang");
//            a = a - 1;
//        }
//        
        int a = 0;
        int b = 1;
        int c = 2;
        // [ 0 , 0 , 0 , 0 , 0  ]

        int[] arr = new int[5];
        arr[0] = 100;
        arr[2] = -10;
        arr[4] = 76;
        System.out.println("Do dai cua mang:" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // switch case, do...while
        

    }
}
