/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.StudentDAO;
import models.StudentDTO;

/**
 *
 * @author thiennd
 */
public class StudentController {

    StudentDAO studentDAO = new StudentDAO();

    public boolean create(StudentDTO studentDTO) {
        boolean returnValue = false;
        try {
            studentDAO.save(studentDTO);
            returnValue = true;
        } catch (IOException ex) {
            returnValue = false;
            System.out.println("fail to save file");
        } finally {
            return returnValue;
        }
    }

    public StudentDTO read(int id) {
        StudentDTO s = null;
        try {
            s = studentDAO.load(id);
        } catch (IOException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return s;
        }
    }

    public boolean update(StudentDTO studentDTO) {
        boolean returnValue = false;
        try {
            studentDAO.save(studentDTO);
            returnValue = true;
        } catch (IOException ex) {
            returnValue = false;
            System.out.println("fail to save file");
        } finally {
            return returnValue;
        }
    }

    public void delete(StudentDTO studentDTO) {
        studentDAO.remove(studentDTO);
    }

}
