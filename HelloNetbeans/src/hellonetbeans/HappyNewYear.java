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
public class HappyNewYear {

    static String title = "Chúc mừng năm mới";

    public static void main(String[] args) {
        Integer a = new Integer(5);
        System.out.println(a+5);
    }

    static void Excute(String str) {
        int current = 0;
        int count = 1;
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                if (count > max) {
                    max = count;
                    maxIndex = current;
                }
                current = i + 1;
                count = 1;
            } else {
                ++count;
            }
        }
        if (count > max) {
            max = count;
            maxIndex = current;
        }

        for (int i = maxIndex; i < maxIndex + max; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }

}
