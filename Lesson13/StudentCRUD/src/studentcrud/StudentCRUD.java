/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcrud;

import controllers.StudentController;
import java.io.IOException;
import models.StudentDTO;
import views.MainFrame;

/**
 *
 * @author thiennd
 */
public class StudentCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        StudentController studentController = new StudentController();
//
//        StudentDTO thang = new StudentDTO();
//        thang.setName("Cu");
//        thang.setId(20161234);
//        
//        studentController.create(thang);
//
//        StudentDTO s1 = studentController.read(20161234);
//        System.out.println(s1);
//
//        s1.setCPA(3);
//        studentController.update(s1);
//
//        StudentDTO s2 = studentController.read(20161234);
//        System.out.println(s2);
//        
//        StudentDTO s3 = new StudentDTO();
//        s3.setId(100);
//        studentController.delete(s3);
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        
    }
    
}
