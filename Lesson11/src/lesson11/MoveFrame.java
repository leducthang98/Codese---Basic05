/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author thiennd
 */
public class MoveFrame extends JFrame implements KeyListener, Runnable {

    Model model;

    int screenSize = 1000; // 
    int chessSize = 100;
    int step = 10;

    public MoveFrame() {
        setSize(screenSize, screenSize);
        setVisible(true);
        setTitle("Move you ass!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);
//        Thread thread = new Thread(this);
//        thread.start();
    }

    @Override
    public void paint(Graphics g) { // as pencil 
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        // draw background 
//        g.drawImage(image, WIDTH, WIDTH, this);
        g.setColor(Color.pink);
        g.fillRect(0, 0, screenSize, screenSize);

        // draw player
        g.setColor(Color.CYAN);
        g.fillRect(model.player_x, model.player_y, chessSize, chessSize); // hard-code 

        // draw enemy
        g.setColor(Color.RED);
        g.fillRect(model.enemy_x, model.enemy_y, chessSize, chessSize);

        // draw target 
        g.setColor(Color.green);
        g.drawRect(model.target_x, model.target_y, chessSize, chessSize);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {

        // Player move 
        switch (ke.getKeyCode()) {
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                model.player_x = (model.player_x - step + screenSize) % screenSize;
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                model.player_y = (model.player_y + step) % screenSize;
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                model.player_x = (model.player_x + step) % screenSize;
                break;
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                model.player_y = (model.player_y - step + screenSize) % screenSize;
                break;
        }
        // Enemy move 
        double direction = Math.random();
        if (direction < 0.25) {
            if (model.enemy_x < screenSize - chessSize) {
                model.enemy_x += step;
            }
        } else if (direction < 0.5) {
            if (model.enemy_x > 0) {
                model.enemy_x -= step;
            }
        } else if (direction < 0.75) {
            if (model.enemy_y < screenSize - chessSize) {
                model.enemy_y += step;
            }
        } else {
            if (model.enemy_y > 0) {
                model.enemy_y -= step;
            }
        }

        // Check win or lose or alive
        switch (model.checkStatus()) {
            case Model.WIN:
                System.out.println("Win");
                removeKeyListener(this);
                break;
            case Model.LOSE:
                System.out.println("Lose");
                removeKeyListener(this);
                break;
            case Model.PLAYING:
                break;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    @Override
    public void run() {

    }

}
