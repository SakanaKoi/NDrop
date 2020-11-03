package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //проблема: прямой доступ к полям класса. Такое нежелательно.
        NDrob fract1 = new NDrob();
        //fract1.num = 3;
        //fract1.denom = 5;
        fract1.setNum(3);
        fract1.setDenom(5);
        NDrob fract2 = new NDrob();
        //fract2.num = sc.nextInt();
        //fract2.denom = sc.nextInt();
        fract2.setNum(sc.nextInt());
        fract2.setDenom(sc.nextInt());
        fract1.print();
        System.out.println(fract2);
        System.out.println(fract1.multi(fract2).evqleed(fract1.multi(fract2)));
        System.out.println(fract1.div(fract2).evqleed(fract1.div(fract2)));
        System.out.println(fract1.sum(fract2).evqleed(fract1.sum(fract2)));
        System.out.println(fract1.differ(fract2).evqleed(fract1.differ(fract2)));
    }
}
