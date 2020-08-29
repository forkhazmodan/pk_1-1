package com.kp.chukhnovm.hw1_1;

import java.util.Date;
import java.util.Random;

public class Cat {

    private String name;
    private String color;
    private Date birthday;

    // TODO: Is that necessary?
    public Cat() {
    }

    public Cat(String name, Date birthday, String color) {
        this.name = name;
        this.birthday = birthday;
        this.color = color;
    }

    /*
    |--------------------------------------------------------------------------
    | GETTERS & SETTERS
    |--------------------------------------------------------------------------
    */

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Date getBirthday() {
        return birthday;
    }

    /**
     * Get age in days
     *
     * @return
     */
    public long getAgeInDays() {

        Date d1 = this.getBirthday();
        Date d2 = new Date();


        return d1 == null || d2 == null
            ? 0
            : (d2.getTime() - d1.getTime()) / (24 * 60 * 60 * 1000);
    }

    /*
    |--------------------------------------------------------------------------
    | METHODS
    |--------------------------------------------------------------------------
    */

    public void voice() {

        if(this.getBirthday() == null) {
            return;
        }

        String[] mood = {
            "Purrs...",
            "Uff",
            "Meow",
            "ЖРАТЬ ДАВАЙ!",
        };

        int rnd = new Random().nextInt(mood.length);

        System.out.println(mood[rnd]);
    }

    @Override
    public String toString() {
        return String.format("Cat {name='%s', color='%s', birthday='%3$tY-%3$tm-%3$td', age='%4$s'}",
            this.getName(),
            this.getColor(),
            this.getBirthday(),
            this.getAgeInDays()
        );
    }
}
