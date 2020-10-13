package com.mybigpackage;

import com.mybigpackage.money.Money;
import com.mybigpackage.ui.WindowFrame;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Starting Clicker");

	    Money money = new Money();
        WindowFrame frame = new WindowFrame(money);
        Runnable bg_thread = new BackgroundThread(money, frame);
        new Thread(bg_thread).start();

        frame.display();
    }
}
