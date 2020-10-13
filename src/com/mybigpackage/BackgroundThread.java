package com.mybigpackage;

import com.mybigpackage.money.Money;
import com.mybigpackage.ui.WindowFrame;

public class BackgroundThread implements Runnable {

    Money money;
    WindowFrame frame;

    public BackgroundThread(Money money, WindowFrame frame) {
        this.money = money;
        this.frame = frame;
    }

    @Override
    public void run() {
        while (true) {

            this.money.increment(1);
            this.frame.setMoneyLabel(String.valueOf(money.moneyAmount()));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
