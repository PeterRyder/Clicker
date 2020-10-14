package com.mybigpackage.ui;

import com.mybigpackage.money.Money;
import com.mybigpackage.upgrade.Upgrade1;
import com.mybigpackage.upgrade.Upgrade2;
import com.mybigpackage.upgrade.Upgrade3;

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

    JButton upgrade1_button;
    JButton upgrade2_button;
    JButton upgrade3_button;

    public Upgrade1 upgrade1;
    public Upgrade2 upgrade2;
    public Upgrade3 upgrade3;

    public WindowFrame(Money money, Upgrade1 upgrade1, Upgrade2 upgrade2, Upgrade3 upgrade3) {
        this.frame = new JFrame(this.title);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.money = money;
        this.upgrade1 = upgrade1;
        this.upgrade2 = upgrade2;
        this.upgrade3 = upgrade3;

        addComponents(frame.getContentPane());
    }

    public void actionPerformed(ActionEvent e) {
        money.increment(1);
        setMoneyLabel(String.valueOf(money.moneyAmount()));
    }

    public void setMoneyLabel(String amount) {
        this.moneyLabel.setText(String.format("Money: %s Increment: +%d", amount, this.upgrade1.getAmt() + this.upgrade2.getAmt() * 10 + this.upgrade3.getAmt() * 100));
    }

    public void setUpgrade1Label() {
        this.upgrade1_button.setText(String.format("Upgrade1 Cost: %s Amount: %s", this.upgrade1.getCost(), this.upgrade1.getAmt()));
    }

    public void setUpgrade2Label() {
        this.upgrade2_button.setText(String.format("Upgrade1 Cost: %s Amount: %s", this.upgrade2.getCost(), this.upgrade2.getAmt()));
    }

    public void setUpgrade3Label() {
        this.upgrade3_button.setText(String.format("Upgrade1 Cost: %s Amount: %s", this.upgrade3.getCost(), this.upgrade3.getAmt()));
    }

    private void addComponents(Container pane) {

        upgrade1_button = new JButton("Upgrade1");
        upgrade1_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade1.upgrade();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgrade1Label();
            }
        });
        this.setUpgrade1Label();

        upgrade2_button = new JButton("Upgrade2");
        upgrade2_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade2.upgrade();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgrade2Label();
            }
        });
        this.setUpgrade2Label();

        upgrade3_button = new JButton("Upgrade3");
        upgrade3_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade3.upgrade();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgrade3Label();
            }
        });
        this.setUpgrade3Label();

        pane.add(moneyLabel);
        pane.add(new Label(""));
        pane.add(new Label(""));
        pane.add(upgrade1_button);
        pane.add(new Label(""));
        pane.add(new Label(""));
        pane.add(upgrade2_button);
        pane.add(new Label(""));
        pane.add(new Label(""));
        pane.add(upgrade3_button);
        pane.add(clicker);
        pane.add(new Label(""));

        pane.setLayout(new GridLayout(4,3));

        clicker.addActionListener(this);
    }

    public void display() {
        this.frame.setLocationRelativeTo(null);
        this.frame.setSize(new Dimension(800, 400));
        this.frame.setVisible(true);
    }

}
