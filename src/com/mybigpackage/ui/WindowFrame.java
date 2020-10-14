package com.mybigpackage.ui;

import com.mybigpackage.money.Money;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowFrame implements ActionListener {
    public String title = "Clicker";

    Money money;

    public JFrame frame;

    public JButton clicker = new JButton("Click Me!");
    public JLabel moneyLabel = new JLabel("Money: ");

    public WindowFrame(Money money) {
        this.frame = new JFrame(this.title);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(frame.getContentPane());
        this.money = money;
    }

    public void actionPerformed(ActionEvent e) {
        money.increment(1);
        setMoneyLabel(String.valueOf(money.moneyAmount()));
    }

    public void setMoneyLabel(String amount) {
        this.moneyLabel.setText("Money: " + amount);
    }

    private void addComponents(Container pane) {

        pane.add(moneyLabel);
        pane.add(new Label(""));
        pane.add(new Label(""));
        pane.add(new Button("Upgrade 1 10 Monies"));
        pane.add(new Label(""));
        pane.add(new Label(""));
        pane.add(new Button("Upgrade 2 100 Monies"));
        pane.add(new Label(""));
        pane.add(new Label(""));
        pane.add(new Button("Upgrade 3 1000 Monies"));
        pane.add(clicker);
        pane.add(new Label(""));

        pane.setLayout(new GridLayout(4,3));

        clicker.addActionListener(this);
    }

    public void display() {
        this.frame.setLocationRelativeTo(null);
        this.frame.setSize(new Dimension(600, 400));
        this.frame.setVisible(true);
    }

}
