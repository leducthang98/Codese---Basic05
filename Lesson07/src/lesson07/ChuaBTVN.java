/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07;

import java.util.ArrayList;

/**
 *
 * @author Wind
 */
public class ChuaBTVN {

    public static void main(String[] args) {
//        Point p1 = new Point(3, 4);
//        p1.info();
//
//        Point p2 = new Point(p1);
//        p2.info();
//
//        Point p3 = new Point(new Point(4, 5));
//        p3.info();
//
//        Complex c1 = new Complex(1, -2);
//        c1.show();

        // 4 3 2 1  => sap xep tuan tu : j=0 >
        // 1 2 3 4  => > 
//        int count = 0;
//        int[] a = {1, 3, 2};
//        for (int i = 0; i < a.length - 1; i++) {  //bubble sort
//            for (int j = i + 1; j < a.length; j++) {
//                count++;
//                if (a[i] < a[j]) {
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println("So buoc: " + count);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(4); // 2 4 1 3
        int temp = arr.get(1);
        arr.set(1, 4);
        arr.set(3, temp);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        
    }
}
