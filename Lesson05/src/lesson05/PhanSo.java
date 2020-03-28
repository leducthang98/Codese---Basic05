/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05;

/**
 *
 * @author Wind
 */
public class PhanSo {

    int tu, mau;

    public PhanSo() {

    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo(int tu) {
        this.tu = tu;
    }

    void show() {
        System.out.println(tu + "/" + mau);
    }

    void add(int i) {
        // 1/2 + 5 = (1+2*5)/2
        this.tu = this.tu + i * this.mau;
        this.mau = this.mau;
    }
    //tru, nhan, chia
    //Getter,Setter
}
