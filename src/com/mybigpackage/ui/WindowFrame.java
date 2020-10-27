package com.mybigpackage.ui;

import com.mybigpackage.money.Money;
import com.mybigpackage.upgrade.*;

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
    JButton upgrade4_button;
    JButton upgrade5_button;
    JButton upgrade6_button;
    JButton upgradeTick_button;
    JButton upgradeClick_button;

    public Upgrade upgrade;

    public WindowFrame(Money money, Upgrade upgrade) {
        this.frame = new JFrame(this.title);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.money = money;
        this.upgrade = upgrade;

        addComponents(frame.getContentPane());
    }

    public void actionPerformed(ActionEvent e) {
        money.increment(upgrade.getAmtC());
        setMoneyLabel(String.valueOf(money.moneyAmount()));
    }

    public void setMoneyLabel(String amount) {
        this.moneyLabel.setText(String.format("Money: %s Increment: +%d", amount, this.upgrade.getAmt1() + this.upgrade.getAmt2() * 10 +
                this.upgrade.getAmt3() * 100 + this.upgrade.getAmt4() * 1000 + this.upgrade.getAmt5() * 10000 + this.upgrade.getAmt6() * 100000));
    }

    public void setUpgrade1Label() {
        this.upgrade1_button.setText(String.format("Upgrade1 Cost: %s Amount: %s", this.upgrade.getCost1(), this.upgrade.getAmt1()));
    }

    public void setUpgrade2Label() {
        this.upgrade2_button.setText(String.format("Upgrade2 Cost: %s Amount: %s", this.upgrade.getCost2(), this.upgrade.getAmt2()));
    }

    public void setUpgrade3Label() {
        this.upgrade3_button.setText(String.format("Upgrade3 Cost: %s Amount: %s", this.upgrade.getCost3(), this.upgrade.getAmt3()));
    }

    public void setUpgrade4Label() {
        this.upgrade4_button.setText(String.format("Upgrade4 Cost: %s Amount: %s", this.upgrade.getCost4(), this.upgrade.getAmt4()));
    }

    public void setUpgrade5Label() {
        this.upgrade5_button.setText(String.format("Upgrade5 Cost: %s Amount: %s", this.upgrade.getCost5(), this.upgrade.getAmt5()));
    }

    public void setUpgrade6Label() {
        this.upgrade6_button.setText(String.format("Upgrade6 Cost: %s Amount: %s", this.upgrade.getCost6(), this.upgrade.getAmt6()));
    }

    public void setUpgradeTickLabel() {
        this.upgradeTick_button.setText(String.format("Upgrade Tick Cost: %s Amount: %s", this.upgrade.getCostT(), this.upgrade.getAmtT()));
    }

    public void setUpgradeClickLabel() {
        this.upgradeClick_button.setText(String.format("Upgrade Click Cost: %s Amount: %s", this.upgrade.getCostC(), this.upgrade.getAmtC()));
    }


    private void addComponents(Container pane) {

        upgrade1_button = new JButton("Upgrade1");
        upgrade1_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade.upgrade1();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgrade1Label();
            }
        });
        this.setUpgrade1Label();

        upgrade2_button = new JButton("Upgrade2");
        upgrade2_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade.upgrade2();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgrade2Label();
            }
        });
        this.setUpgrade2Label();

        upgrade3_button = new JButton("Upgrade3");
        upgrade3_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade.upgrade3();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgrade3Label();
            }
        });
        this.setUpgrade3Label();

        upgrade4_button = new JButton("Upgrade4");
        upgrade4_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade.upgrade4();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgrade4Label();
            }
        });
        this.setUpgrade4Label();

        upgrade5_button = new JButton("Upgrade5");
        upgrade5_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade.upgrade5();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgrade5Label();
            }
        });
        this.setUpgrade5Label();

        upgrade6_button = new JButton("Upgrade6");
        upgrade6_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade.upgrade6();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgrade6Label();
            }
        });
        this.setUpgrade6Label();

        upgradeTick_button = new JButton("UpgradeTick");
        upgradeTick_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade.upgradeT();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgradeTickLabel();
            }
        });
        this.setUpgradeTickLabel();

        upgradeClick_button = new JButton("UpgradeClick");
        upgradeClick_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrade.upgradeC();
                setMoneyLabel(String.valueOf(money.moneyAmount()));
                setUpgradeClickLabel();
            }
        });
        this.setUpgradeClickLabel();

        pane.add(new Label(""));
        pane.add(moneyLabel);
        pane.add(new Label(""));
        pane.add(upgrade1_button);
        pane.add(upgrade2_button);
        pane.add(upgrade3_button);
        pane.add(upgrade4_button);
        pane.add(upgrade5_button);
        pane.add(upgrade6_button);
        pane.add(upgradeTick_button);
        pane.add(clicker);
        pane.add(upgradeClick_button);

        pane.setLayout(new GridLayout(4,3));

        clicker.addActionListener(this);
    }

    public void display() {
        this.frame.setLocationRelativeTo(null);
        this.frame.setSize(new Dimension(800, 400));
        this.frame.setVisible(true);
    }

}
