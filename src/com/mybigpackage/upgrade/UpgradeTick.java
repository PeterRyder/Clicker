package com.mybigpackage.upgrade;

import com.mybigpackage.money.Money;

public class UpgradeTick extends Upgrade{

    int cost = 1000;
    int amt = 1000;

    public UpgradeTick(Money money) {
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
        if (amt == 10) {

        }
        else if (cost <= total) {
            money.decrement(cost);
            amt -= 10;
            cost += 1000;
        }
    }
}
