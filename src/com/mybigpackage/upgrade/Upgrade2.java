package com.mybigpackage.upgrade;

import com.mybigpackage.money.Money;

public class Upgrade2 extends Upgrade{

    int cost = 100;
    int amt = 0;

    public Upgrade2(Money money) {
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
            cost += 10;
        }
        else {
        }
    }


}
