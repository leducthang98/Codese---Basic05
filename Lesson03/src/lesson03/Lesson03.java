/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class Lesson03 {

    public static void main(String[] args) {
//        int[] arr = new int[5];
//        int[] arr1 = {1, 2, 3, 4, 10}; // 5 => |x-5|
//        // =>  1 2 3 2 1 5/2 arr[i] vs arr[length-i-1]
//        //tao 1 bien boolean = true, cu khi nao 2 phan tu khong bang nhau => false, return.
//        int max = arr1[0];
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] > max) {
//                max = arr1[i];
//            }
//        }

//        int a = 0;
//        Integer a = new Integer(5);
//
//        Double b = new Double(0.00 / 0.00);
//        System.out.println(b.isNaN());
//        String name = "Le Duc Thang";
//        String name2 = new String("Le Duc Thang");
//        System.out.println(name);
//        char[] ch = {'t', 'h', 'a', 'n', 'g'}; // dcon = z clone
//
//        String name3 = new String(ch); // name3 = thang => tao dia chi o nho cho name3
//        System.out.println(name3);
//        String name4 = "thang"; // name4 = thang => cung 1 ban the voi name3 <=> same instance
//        int r = 4; // a
//        int y = 4; // b
//        Integer h = new Integer(r);
//        String name = "Ldadfase Duec Thangggggg";
//        String name2 = new String("Git commit -m /'Lesson04/' ");
//        int[] arr = {1, 2, 3, 4, 5};
//        arr[2] = 0;
//        char ch = name.charAt(5);
//
//        Character ch2 = new Character('%');
//        Character ch3 = new Character('d');
//
//        System.out.println((char) (ch3 - 3));
//        double b = 3.94;
//        int a = (int) b;
//        int c = name.compareTo(name2);
//        System.out.println(c);
//        boolean isContains = name.contains("Ngggg");
//
//        boolean isEndWith = name.endsWith("gggg");
//        System.out.println(isEndWith);
//        int index = name.indexOf("e");
//        System.out.println(index);
//        System.out.println(name.length());
//        // git add 
//        for (String split : name2.split(" ")) {
//            System.out.println(split);
//        }
//        int[][] arr = {{1, 2, 3}, {4, 5, 6, 8, 5}, {8, 9}};
//        int[] a = arr[2];
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//        for (int i = 0; i < arr.length; i++) {
//            //arr[i] ={1,2,3}
//            System.out.println("Vong lap ngoai i =" + i);
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println("\tVong lap con j=" + j + ", gia tri arr[" + i + "," + j + "] = " + arr[i][j]);
//            }
//        } => Ctrl + /
//        int[][] arr = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao hang:");
//        int row = sc.nextInt();
//        System.out.println("Nhap vao cot:");
//        int col = sc.nextInt();
//        int[][] arr = new int[row][col];
//        //[0,0,0]
//        //[1,0,0]
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.println("Nhap vao phan tu " + i + "," + j);
//                arr[i][j] = sc.nextInt();
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.println("max:" + max);
//        A();
//        int c = sum(5, 6);
//        System.out.println(c);    main => hello => main
        String a = hello("Hoang");
        System.out.println(a);
        A("Thang");
    }

    static void A(String name) {
        System.out.println("Alo" + name);
        System.out.println("Blo");
    }
    // static returnData name( inputData ){
    // Progress
    // }

    static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    static String hello(String name) {
        String result = name + "asdasdasd";
        System.out.println("Hello " + name);
        return result;
    }

}
