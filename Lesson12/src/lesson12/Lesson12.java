/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12;

import lesson12.controller.StudentController;
import lesson12.database.StudentFile;
import lesson12.views.StudentCreateFrame;
import lesson12.views.StudentReadFrame;

/**
 *
 * @author thiennd
 */
public class Lesson12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentController.
                getInstance().
                setStudentDB(new StudentFile()); // File

        StudentCreateFrame scf = new StudentCreateFrame();
        StudentReadFrame srf = new StudentReadFrame();
        // MVC + Single-ton

    }

}
