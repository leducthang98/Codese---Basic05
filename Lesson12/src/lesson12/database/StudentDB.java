/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12.database;

import lesson12.models.Student;

/**
 *
 * @author thiennd
 */
public interface StudentDB {

    public void create(Student s);

    public Student read(int id);

    public void update(Student s);

    public void delete(Student s);

}
