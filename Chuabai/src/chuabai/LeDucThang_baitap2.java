/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabai;

class LUMatrix {

    static int MAX = 100;
    static String s = "";

    static void luDecomposition(int[][] mat, int n) {
        int[][] lower = new int[n][n];
        int[][] upper = new int[n][n];
        
        // Decomposing matrix into Upper and Lower 
        // triangular matrix 
        for (int i = 0; i < n; i++) {
System.out.println(lower[1][0]);
            // Upper Triangular 
            for (int k = i; k < n; k++) {

                // Summation of L(i, j) * U(j, k) 
                int sum = 0;
                for (int j = 0; j < i; j++) {
                    sum += (lower[i][j] * upper[j][k]);
                    System.out.println(sum);
                }

                // Evaluating U(i, k) 
                upper[i][k] = mat[i][k] - sum;
            }

            // Lower Triangular 
            for (int k = i; k < n; k++) {
                if (i == k) {
                    lower[i][i] = 1; // Diagonal as 1 
                } else {

                    // Summation of L(k, j) * U(j, i) 
                    int sum = 0;
                    for (int j = 0; j < i; j++) {
                        sum += (lower[k][j] * upper[j][i]);
                    }

                    // Evaluating L(k, i) 
                    lower[k][i] = (mat[k][i] - sum) / upper[i][i];
                }
            }
        }

        // Displaying the result : 
        for (int i = 0; i < n; i++) {
            // Lower 
            for (int j = 0; j < n; j++) {
                System.out.print(lower[i][j] + "\t");
            }
            System.out.print("\t");

            // Upper 
            for (int j = 0; j < n; j++) {
                System.out.print(upper[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String arr[]) {
        int mat[][] = {{2, -1, -2},
        {-4, 6, 3},
        {-4, -2, 8}};

        luDecomposition(mat, 3);
    }
}
