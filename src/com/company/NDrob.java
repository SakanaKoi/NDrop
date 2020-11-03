package com.company;

public class NDrob {
    private int num; //числитель
    private int denom; //знаменатель

    public void setNum(int num) {
        this.num = num;
    }

    public void setDenom(int denom) {
        if (denom != 0) {
            this.denom = denom;
        }
        else {
            this.denom = 1;
        }
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    public NDrob multi(NDrob secondMn) {
        NDrob rez = new NDrob();
        rez.num = this.num * secondMn.num;
        rez.denom = this.denom * secondMn.denom;
        return rez;
    }
    public NDrob div(NDrob del) {
        NDrob rez = new NDrob();
        rez.num = this.num * del.denom;
        rez.denom = this.denom * del.num;
        return rez;
    }
    public NDrob sum(NDrob summa) {
        NDrob rez = new NDrob();
        rez.num = this.num * summa.denom + this.denom * summa.num;
        rez.denom = this.denom * summa.denom;
        return rez;
    }
    public NDrob differ(NDrob dif) {
        NDrob rez = new NDrob();
        rez.num = this.num * dif.denom - this.denom * dif.num;
        rez.denom = this.denom * dif.denom;
        return rez;
    }
    public NDrob evqleed(NDrob drob) {
        NDrob o = new NDrob();
        int n1;
        int n2 = drob.num;
        if (n2 != 0) {
            if (drob.num > drob.denom) {
                n1 = drob.num;
                n2 = drob.denom;
            } else {
                n1 = drob.denom;
                n2 = drob.num;
            }
            int rez = 1;
            int ost = 1;
            while (ost != 0) {
                rez = n1 / n2;
                ost = n1 % n2;
                if (ost != 0) {
                    n1 = n2;
                    n2 = ost;
                }
            }
            o.num = this.num / n2;
            o.denom = this.denom / n2;
            return o;
        }
        else {
            o.num = this.num;
            o.denom = this.denom;
            return o;
        }
    }

    //служебные методы (сеттеры, геттеры, конструкторы и пр.)
    //вычислительные методы
    //методы поддержки
    public void print() {
        System.out.println(num + "/" + denom);
    }

    @Override
    public String toString() {
        return num + "/" + denom;
    }
}
