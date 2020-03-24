package hoclaibuoi1;

import java.util.Scanner;

public class HocLaiBuoi1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input row number 1");
        int row = sc.nextInt();
        System.out.println("input column number 1");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("phan tu ma tran  [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("input row number2 ");
        int row1 = sc.nextInt();
        System.out.println("input column number2");
        int col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.println("phan tu ma tran  [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }

        if (row == row1 || col == col1) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    int arr2 = 0;
                    arr2 = arr[i][j] + arr1[i][j];
                    System.out.println("phan tu ma tran  [" + i + "][" + j + "]" + arr2);
                }
            }

        } else {
            System.out.println("khong cong duoc ");
        }
    }

}
