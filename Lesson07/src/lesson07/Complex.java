/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07;

/**
 *
 * @author Wind
 */
public class Complex {

    // a + bi 
    private double phanThuc, phanAo;

    public Complex() {
    }

    public Complex(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public Complex(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    void show() {
        if (this.phanAo < 0) {
            System.out.println(phanThuc + this.phanAo + "i");
        } else {
            System.out.println(phanThuc + "+" + this.phanAo + "i");
        }
    }

    void add(Complex c) {
        this.phanAo += c.phanAo;
        this.phanThuc += c.phanThuc;
    }

    void sub(Complex c) {
        this.phanAo -= c.phanAo;
        this.phanThuc -= c.phanThuc;
    }

}
