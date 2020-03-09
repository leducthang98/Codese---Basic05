package homework1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel firstNumberLabel = new JLabel("First Number");
    JLabel secondNumberLabel = new JLabel("Second Number");
    JTextField firstNumberTextField = new JTextField();
    JTextField secondNumberField = new JTextField();
    JLabel resultLabel = new JLabel("Result");
    JLabel textResultNumber = new JLabel("");
    JButton addButton = new JButton("+");
    JButton minusButton = new JButton("-");
    JButton mulButton = new JButton("*");
    JButton divButton = new JButton("/");
    JButton percentButton = new JButton("%");
    JButton clearButton = new JButton("CLEAR");

    calc() {
        //Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        //Setting location and Size of each components using setBounds() method.
        firstNumberLabel.setBounds(0, 0, 100, 30);
        secondNumberLabel.setBounds(0, 50, 100, 30);
        firstNumberTextField.setBounds(150, 0, 200, 30);
        secondNumberField.setBounds(150, 50, 200, 30);
        resultLabel.setBounds(0, 100, 100, 30);
        textResultNumber.setBounds(150, 100, 100, 30);
        addButton.setBounds(0, 200, 150, 60);
        minusButton.setBounds(170, 200, 150, 60);
        mulButton.setBounds(0, 300, 150, 60);
        divButton.setBounds(170, 300, 150, 60);
        percentButton.setBounds(0, 400, 150, 60);
        clearButton.setBounds(170, 400, 150, 60);

    }

    public void addComponentsToContainer() {
        //Adding each components to the Container
        container.add(firstNumberLabel);
        container.add(secondNumberLabel);
        container.add(firstNumberTextField);
        container.add(secondNumberField);
        container.add(resultLabel);
        container.add(textResultNumber);
        container.add(addButton);
        container.add(minusButton);
        container.add(mulButton);
        container.add(divButton);
        container.add(percentButton);
        container.add(clearButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] a) {
        calc frame = new calc();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }
}
