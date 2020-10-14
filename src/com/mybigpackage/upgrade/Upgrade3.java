package com.mybigpackage.upgrade;

import com.mybigpackage.money.Money;

public class Upgrade3 extends Upgrade {

    int cost = 1000;
    int amt = 0;

    public Upgrade3(Money money) {
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
        if (cost < total) {
            money.decrement(cost);
            amt++;
            cost += 100;
        }
        else {
        }
    }
}
