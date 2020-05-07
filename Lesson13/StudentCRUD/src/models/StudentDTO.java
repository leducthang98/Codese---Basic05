/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author thiennd
 */
public class StudentDTO implements Serializable{
    int id;
    String name;
    float CPA;

    @Override
    public String toString() {
        return "StudentDTO{" + "id=" + id + ", name=" + name + ", CPA=" + CPA + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCPA() {
        return CPA;
    }

    public void setCPA(float CPA) {
        this.CPA = CPA;
    }
    
}
