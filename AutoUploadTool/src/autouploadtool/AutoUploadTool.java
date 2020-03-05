/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autouploadtool;

import javax.swing.JFrame;

/**
 *
 * @author Wind
 */
public class AutoUploadTool {

    JFrame frame;

    public AutoUploadTool() {
        initContainer();
        initComponent();
        addComponent();
        addEvent();
        showGUI();
    }

    private void initContainer() {
        frame = new JFrame("AutoUploadTool");
        frame.setSize(700, 700);
        frame.setResizable(false); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponent() {
    }

    private void addComponent() {
    }

    private void addEvent() {
    }

    private void showGUI() {
        frame.setVisible(true);
    }

}
