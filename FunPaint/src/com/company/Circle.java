package com.company;

/**
 * Created by eladlavi on 1/14/15.
 */
public class Circle {
    private int radius;
    private int xPos;



    private int yPos;
    public Circle(){
        radius = 10;
        xPos = 20;
        yPos = 20;
    }

    @Override
    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int r){
        if(r>=0)
            radius = r;
    }

    public int getXpos(){
        return xPos;
    }

    public void setXpos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

}
