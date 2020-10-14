package com.mybigpackage.upgrade;

import com.mybigpackage.money.Money;

public class Upgrade1 extends Upgrade{

    int cost = 10;
    int amt = 0;

    public Upgrade1(Money money) {
        super(money);
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getAmt() {
        return amt;
    }

    @Override
    public void upgrade() {
        long total = money.moneyAmount();
        if (cost <= total) {
            money.decrement(cost);
            amt++;
            cost++;
        }
    }






}
