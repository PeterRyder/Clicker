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
        this.moneyLabel.setText(amount);
    }

    private void addComponents(Container pane) {
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(clicker, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(moneyLabel, c);

        clicker.addActionListener(this);

    }

    public void display() {
        this.frame.setLocationRelativeTo(null);
        this.frame.setSize(new Dimension(600, 800));
        this.frame.pack();
        this.frame.setVisible(true);
    }

}
