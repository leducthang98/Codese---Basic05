/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellonetbeans;

/**
 *
 * @author Wind
 */
public class bt1 {

    public static void main(String[] args) {

        int a[] = {5, 5, 5, 5, 5, 5, 5, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3};
        int count = 1;
        int maxValue = 0;
        int maxCount = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            } else {
                if (count == maxCount) {
                    if (a[i] > maxValue) {
                        maxCount = count;
                        maxValue = a[i];
                        count = 1;
                    }
                } else if (count > maxCount) {
                    maxCount = count;
                    maxValue = a[i];
                    count = 1;
                }
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = a[a.length - 1];
        }
        System.out.println("maxValue: " + maxValue + ", maxCount: " + maxCount);
    }
}
