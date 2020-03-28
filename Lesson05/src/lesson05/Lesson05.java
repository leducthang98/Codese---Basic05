//package lesson05;
//
//import java.util.Scanner;
//
//public class Lesson05 {
//
//    static char PLAYER = 'X';
//    static char[][] MAP = new char[3][3];
//    static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        // game co caro 3x3, 2 nguoi choi voi nhau, di nuoc bang cach nhap toa do !
//        for (int i = 0; i < MAP.length; i++) {
//            for (int j = 0; j < MAP.length; j++) {
//                MAP[i][j] = '-';
//            }
//        }
//        while (true) {
//            show();
//            move();
//            check();
//            swap();
//        }
//    }
//
//    static void show() {
//        for (int i = 0; i < MAP.length; i++) {
//            for (int j = 0; j < MAP.length; j++) {
//                System.out.print(MAP[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
//
//    static void move() {
//        System.out.println("Player "+ PLAYER +": ");
//        String input = sc.nextLine();
//        int x = (int) input.charAt(0) - 48;
//        int y = (int) input.charAt(2) - 48; 
//        MAP[x][y] = PLAYER;
//    }
//
//    static void check() {
//    }
//
//    static void swap() {
//        if (PLAYER == 'X') {
//            PLAYER = 'O';
//        } else {
//            PLAYER = 'X';
//        }
//    }
//}
