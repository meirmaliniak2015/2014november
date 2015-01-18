package com.company;

/**
 * Created by eladlavi on 1/18/15.
 */
public class Dog {
    int color;
    byte breed;
    boolean gender;
    boolean isAlive;
    int yearOfBirth;
    int monthOfBirth;

    public void bark(){
        if(isAlive){
            if(gender){
                System.out.println("waf waf");
            }else{
                System.out.println("bff bff");
            }

        }
    }
}
