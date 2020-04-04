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
public class Point {

    int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Point() {
    }

    public Point(int xPos) {
        this.xPos = xPos;
    }

    public Point(Point p) {
        this.xPos = p.xPos;
        this.yPos = p.yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    void info() {
        System.out.println("(" + this.xPos + ", " + this.yPos + ")");
    }

}
