package com.kp.chukhnovm.hw1_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = {
            new Cat(),
            new Cat("Vasya", new GregorianCalendar(2017, Calendar.DECEMBER, 8).getTime(), "red"),
            new Cat("Petya", new GregorianCalendar(2016, Calendar.JULY, 21).getTime(), "green"),
            new Cat("Kisa", new GregorianCalendar(2019, Calendar.JULY, 5).getTime(), "yellow")
        };

        for (Cat cat : cats) {
            System.out.println(cat);
            cat.voice();
            System.out.println();
        }
    }
}
