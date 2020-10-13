package com.mybigpackage.money;

public class Money {

    private long money = 0;

    public synchronized void increment(int amount) {
        this.money += amount;
    }

    public synchronized void decrement(int amount) {
        this.money -= amount;
    }

    public long moneyAmount() {
        return this.money;
    }
}
