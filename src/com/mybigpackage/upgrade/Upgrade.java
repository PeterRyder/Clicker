package com.mybigpackage.upgrade;

import com.mybigpackage.money.Money;

public class Upgrade {

    Money money;

    int amt1 = 0;
    int amt2 = 0;
    int amt3 = 0;
    int amt4 = 0;
    int amt5 = 0;
    int amt6 = 0;
    int amtC = 1;
    int amtT = 1000;

    int cost1 = 10;
    int cost2 = 100;
    int cost3 = 1000;
    int cost4 = 10000;
    int cost5 = 100000;
    int cost6 = 1000000;
    int costC = 100;
    int costT = 1000;

    public Upgrade (Money money){
        this.money = money;
    }
    public int getCost1() {
        return cost1;
    }
    public int getAmt1() {
        return amt1;
    }

    public void upgrade1() {
        long total = money.moneyAmount();
        if (cost1 <= total) {
            money.decrement(cost1);
            amt1++;
            cost1 += 10;
        }
    }
    public int getCost2() {
        return cost2;
    }
    public int getAmt2() {
        return amt2;
    }

    public void upgrade2() {
        long total = money.moneyAmount();
        if (cost2 <= total) {
            money.decrement(cost2);
            amt2++;
            cost2 += 100;
        }
    }
    public int getCost3() {
        return cost3;
    }
    public int getAmt3() {
        return amt3;
    }

    public void upgrade3() {
        long total = money.moneyAmount();
        if (cost3 <= total) {
            money.decrement(cost3);
            amt3++;
            cost3 += 100;
        }
    }
    public int getCost4() {
        return cost4;
    }
    public int getAmt4() {
        return amt4;
    }

    public void upgrade4() {
        long total = money.moneyAmount();
        if (cost4 <= total) {
            money.decrement(cost4);
            amt4++;
            cost4 += 100;
        }
    }
    public int getCost5() {
        return cost5;
    }
    public int getAmt5() {
        return amt5;
    }

    public void upgrade5() {
        long total = money.moneyAmount();
        if (cost5 <= total) {
            money.decrement(cost5);
            amt5++;
            cost5 += 100;
        }
    }
    public int getCost6() {
        return cost6;
    }
    public int getAmt6() {
        return amt6;
    }

    public void upgrade6() {
        long total = money.moneyAmount();
        if (cost6 <= total) {
            money.decrement(cost6);
            amt6++;
            cost6 += 100;
        }
    }
    public int getCostC() {
        return costC;
    }
    public int getAmtC() {
        return amtC;
    }

    public void upgradeC() {
        long total = money.moneyAmount();
        if (costC <= total) {
            money.decrement(costC);
            amtC++;
            costC += 100;
        }
    }
    public int getCostT() {
        return costT;
    }
    public int getAmtT() {
        return amtT;
    }

    public void upgradeT() {
        long total = money.moneyAmount();
        if (amtT == 10) {

        }
        else if (costT <= total) {
            money.decrement(costT);
            amtT -= 10;
            costT += 1000;
        }
    }




}
