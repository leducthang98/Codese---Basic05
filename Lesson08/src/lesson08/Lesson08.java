/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wind
 */
public class Lesson08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // File FileReader FileWriter
//        File folder = new File("LeDucThang");
//        folder.mkdir();
//        System.out.println("Tao thanh cong");
//        File file1 = new File(folder.getPath()+ "//thang.txt"); //=> LeDucThang/thang.txt
//        file1.createNewFile();

        File f = new File("LeDucThang//thang.txt");
//        FileReader fr = new FileReader(f);
//        int i;
//        while ((i = fr.read()) != -1) {
//            System.out.print((char) i);
//        }
//        System.out.println("");
//        fr.close();
//        FileWriter fw = new FileWriter(f, false);
//        String kyTuXuongDong = "\r\n";
//        fw.write(kyTuXuongDong + "132412343");
//        fw.close();
        // ghi: FileWriter, doc: File <= FileReader <= BufferReader
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String data = "";
        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }
        br.close();
        fr.close();
        // Class Student Ten MSSV Tuoi Gioi Tinh, Diem 3 mon TVA
        //StudentManagement => Them SV, Sua sv, Xoa SV, Show SV. 

    }

}
