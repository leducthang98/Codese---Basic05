/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Wind
 */
public class SimpleCalculator {

    JFrame frame;
    JButton btnAdd, btnSub, btnMulti, btnDivise, btnPercentage, btnClear;
    JLabel lbFirstNum, lbSecondNum, lbResult, lbResultValue;
    JTextField txtFirstNum, txtSecondNum;

    public SimpleCalculator() {
        initContainer();
        initComponent();
        addComponent();
        addEvent();
        showGUI();
    }

    private void initContainer() { // Initialize & Customize container
        frame = new JFrame("Calculator");
        frame.setSize(400, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
    }

    private void initComponent() { // Initialize & Customize components
        lbFirstNum = new JLabel("First Number");
        lbFirstNum.setBounds(10, 10, 100, 30);

        lbSecondNum = new JLabel("Second Number");
        lbSecondNum.setBounds(10, 60, 100, 30);

        lbResult = new JLabel("Result");
        lbResult.setBounds(10, 110, 100, 30);

        lbResultValue = new JLabel("0");
        lbResultValue.setBounds(170, 110, 200, 30);

        btnAdd = new JButton("+");
        btnAdd.setFont(new Font("Courier New", Font.BOLD, 19));
        btnAdd.setBounds(10, 180, 150, 50);

        btnClear = new JButton("CLEAR");
        btnClear.setFont(new Font("Courier New", Font.BOLD, 19));
        btnClear.setBounds(210, 320, 150, 50);

        btnSub = new JButton("-");
        btnSub.setFont(new Font("Courier New", Font.BOLD, 19));
        btnSub.setBounds(210, 180, 150, 50);

        btnMulti = new JButton("x");
        btnMulti.setFont(new Font("Courier New", Font.BOLD, 19));
        btnMulti.setBounds(10, 250, 150, 50);

        btnDivise = new JButton("/");
        btnDivise.setFont(new Font("Courier New", Font.BOLD, 19));
        btnDivise.setBounds(210, 250, 150, 50);

        btnPercentage = new JButton("%");
        btnPercentage.setFont(new Font("Courier New", Font.BOLD, 19));
        btnPercentage.setBounds(10, 320, 150, 50);

        txtFirstNum = new JTextField();
        txtFirstNum.setBounds(170, 10, 200, 30);

        txtSecondNum = new JTextField();
        txtSecondNum.setBounds(170, 60, 200, 30);

    }

    private void addComponent() { //Add components into container
        frame.add(lbFirstNum);
        frame.add(lbSecondNum);
        frame.add(lbResult);
        frame.add(lbResultValue);
        frame.add(btnAdd);
        frame.add(btnClear);
        frame.add(btnDivise);
        frame.add(btnMulti);
        frame.add(btnPercentage);
        frame.add(btnSub);
        frame.add(txtFirstNum);
        frame.add(txtSecondNum);
    }

    private void addEvent() { // Add Event
        //add
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double[] temp = getInput();
                lbResultValue.setText(String.valueOf(temp[0] + temp[1]));
            }
        });

        //sub
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double[] temp = getInput();
                lbResultValue.setText(String.valueOf(temp[0] - temp[1]));
            }
        });

        //multiple
        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double[] temp = getInput();
                lbResultValue.setText(String.valueOf(temp[0] * temp[1]));
            }
        });

        //Divise
        btnDivise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double[] temp = getInput();
                if (temp[1] == 0) {
                    lbResultValue.setText("Can't divise");
                } else {
                    lbResultValue.setText(String.valueOf(temp[0] / temp[1]));
                }

            }
        });

        //Percentage
        btnPercentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double[] temp = getInput();
                lbResultValue.setText(String.valueOf((temp[0] * temp[1]) / 100));
            }
        });

        //Clear
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                txtFirstNum.setText(null);
                txtSecondNum.setText(null);
                lbResultValue.setText(null);
            }
        });
    }

    private void showGUI() {
        frame.setVisible(true);
    }

    private double[] getInput() {
        double[] result = new double[2];
        try {
            result[0] = Double.valueOf(txtFirstNum.getText());
            result[1] = Double.valueOf(txtSecondNum.getText());
        } catch (Exception e) {
            System.out.println("An error occured");
        }
        return result;
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }

}
