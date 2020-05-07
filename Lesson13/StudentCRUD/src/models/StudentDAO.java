/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author thiennd
 */
public class StudentDAO {

    public void save(StudentDTO studentDTO) throws FileNotFoundException, IOException {
        String fileName = "s" + studentDTO.getId();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(studentDTO);
        out.close();
    }

    public StudentDTO load(int id) throws IOException, ClassNotFoundException {
        String fileName = "s" + id;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        StudentDTO returnValue = (StudentDTO) in.readObject();
        return returnValue;
    }

    public boolean remove(StudentDTO studentDTO) {
        String fileName = "s" + studentDTO.getId();
        File f = new File(fileName);
        if (f.exists()) {
            f.delete();
            return true;
        } else {
            return false;
        }

    }

}
