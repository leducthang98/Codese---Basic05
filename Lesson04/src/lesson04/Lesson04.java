/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson04;

/**
 *
 * @author Wind
 */
public class Lesson04 {

    static int a = 0;

    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9};
//        int result = check(arr);
//        System.out.println(result);
//        System.out.println(a);
//        //while(true){
//        // b1 : loadMap();
//        // b2 : inputCommand();
//        // b3 : changePosition();
//        // b4 : checkWinLose();
//        //}
        int endY = (int) (Math.random() * 4);
        int endX = (int) (Math.random() * 4);
        
        System.out.println(a);

    }

    static int check(int[] a) {
        System.out.println(a);
        boolean tangDan = true;
        boolean giamDan = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                tangDan = false;
            }
            if (a[i] < a[i + 1]) {
                giamDan = false;
            }
            if (!giamDan && !tangDan) {
                break;
            }
        }
        if (giamDan) {
            if (tangDan) {
                return 2;
            } else {
                return -1;
            }
        } else {
            if (tangDan) {
                return 1;
            } else {
                return 0;
            }
        }

    }

    static void A() {
        System.out.println("hello");
        System.out.println(a);
    }

    static void setNum(int[] i) {
        System.out.println(a);
    }

    static int getNum() {
        System.out.println("sdfas");
        System.out.println("sdfas");
        System.out.println("sdfas");
        return 100;
    }

    static int sum(int sh1, int sh2) {
        System.out.println("asdas");
        System.out.println("asdasasddas");
        return sh1 + sh2;
    }

}
