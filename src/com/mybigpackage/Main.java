package com.mybigpackage;

import com.mybigpackage.money.Money;
import com.mybigpackage.ui.WindowFrame;
import com.mybigpackage.upgrade.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Starting Clicker");

	    Money money = new Money();
        Upgrade upgrade = new Upgrade(money);
        WindowFrame frame = new WindowFrame(money, upgrade);
        Runnable bg_thread = new BackgroundThread(money, frame, upgrade);
        new Thread(bg_thread).start();

        frame.display();

    }
}
