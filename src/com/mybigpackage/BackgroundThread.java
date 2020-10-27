package com.mybigpackage;

import com.mybigpackage.money.Money;
import com.mybigpackage.ui.WindowFrame;
import com.mybigpackage.upgrade.*;

public class BackgroundThread implements Runnable {

    Money money;
    WindowFrame frame;
    Upgrade upgrade;
    int total;
    int upgrade1amt;
    int upgrade2amt;
    int upgrade3amt;
    int upgrade4amt;
    int upgrade5amt;
    int upgrade6amt;
    long tick = 1000;

    public BackgroundThread(Money money, WindowFrame frame, Upgrade upgrade) {
        this.money = money;
        this.frame = frame;
        this.upgrade = upgrade;
    }

    @Override
    public void run() {
        while (true) {

            upgrade1amt = upgrade.getAmt1();
            upgrade2amt = upgrade.getAmt2();
            upgrade3amt = upgrade.getAmt3();
            upgrade4amt = upgrade.getAmt4();
            upgrade5amt = upgrade.getAmt5();
            upgrade6amt = upgrade.getAmt6();
            tick = upgrade.getAmtT();

            total = upgrade1amt;
            total += upgrade2amt * 10;
            total += upgrade3amt * 100;
            total += upgrade4amt * 1000;
            total += upgrade5amt * 10000;
            total += upgrade6amt * 100000;

            this.money.increment(total);
            this.frame.setMoneyLabel(String.valueOf(money.moneyAmount()));

            try {
                Thread.sleep(tick);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
