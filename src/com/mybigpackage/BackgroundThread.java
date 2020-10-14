package com.mybigpackage;

import com.mybigpackage.money.Money;
import com.mybigpackage.ui.WindowFrame;
import com.mybigpackage.upgrade.*;

public class BackgroundThread implements Runnable {

    Money money;
    WindowFrame frame;
    Upgrade upgrade;
    Upgrade1 upgrade1;
    Upgrade2 upgrade2;
    Upgrade3 upgrade3;
    UpgradeTick upgradeTick;
    int total;
    int upgrade1amt;
    int upgrade2amt;
    int upgrade3amt;
    long tick = 1000;

    public BackgroundThread(Money money, WindowFrame frame, Upgrade upgrade, Upgrade1 upgrade1, Upgrade2 upgrade2, Upgrade3 upgrade3, UpgradeTick upgradeTick) {
        this.money = money;
        this.frame = frame;
        this.upgrade = upgrade;
        this.upgrade1 = upgrade1;
        this.upgrade2 = upgrade2;
        this.upgrade3 = upgrade3;
        this.upgradeTick = upgradeTick;
    }

    @Override
    public void run() {
        while (true) {

            upgrade1amt = upgrade1.getAmt();
            upgrade2amt = upgrade2.getAmt();
            upgrade3amt = upgrade3.getAmt();
            tick = upgradeTick.getAmt();

            total = upgrade1amt;
            total += upgrade2amt * 10;
            total += upgrade3amt * 100;

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
