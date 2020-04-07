/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

/**
 *
 * @author Wind
 */ //y = ax+b
public class Line {

    private double a, b;

    public Line(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Line() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int checkLine(Line l) {
        if (this.a == l.a) {
            if (this.b == l.b) {
                return 0;
            } else {
                return 1;
            }
        }
        if (this.a * l.a == -1) {
            return 2;
        }
        return -1;
    }

    public boolean checkPoint(Point p) {
        if ((this.a * p.x + this.b - p.y) == 0) {
            return true;
        }
        return false;
    }
}
