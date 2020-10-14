package com.mybigpackage;

import com.mybigpackage.money.Money;
import com.mybigpackage.ui.WindowFrame;
import com.mybigpackage.upgrade.Upgrade;
import com.mybigpackage.upgrade.Upgrade1;
import com.mybigpackage.upgrade.Upgrade2;
import com.mybigpackage.upgrade.Upgrade3;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Starting Clicker");

	    Money money = new Money();
        Upgrade1 upgrade1 = new Upgrade1(money);
        Upgrade2 upgrade2 = new Upgrade2(money);
        Upgrade3 upgrade3 = new Upgrade3(money);
        WindowFrame frame = new WindowFrame(money, upgrade1, upgrade2, upgrade3);
        Upgrade upgrade = new Upgrade(money);
        Runnable bg_thread = new BackgroundThread(money, frame, upgrade, upgrade1, upgrade2, upgrade3);
        new Thread(bg_thread).start();

        frame.display();
    }
}
