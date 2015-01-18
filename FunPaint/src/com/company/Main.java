package com.company;

public class Main {

    public static void main(String[] args) {


        Circle myCircle;

        myCircle = new Circle();
        //a. go find a free spot in the heap.
        //b. mark the spot as taken.
        //c. initialize the object.
        //d. return the object's address in the heap.
        myCircle.setRadius(18);
        System.out.println(myCircle.getRadius());

        myCircle = new Circle();

        Circle mySecondCircle = new Circle();





    }

    public static void drawRectangle(int x, int y, int width, int height){
        for(int i=0;i<y;i++)
            System.out.println();

        for(int i=0;i<height;i++){
            for(int j=0;j<x;j++)
                System.out.print(" ");
            for(int j=0;j<width;j++)
                System.out.print(i>0 && i<height-1 && j>0 && j<width-1 ? " " : "*");
            System.out.println();
        }
    }
}
/*
* Abstraction
* Encapsulation
* Inheritance
* Polymorphism
*/