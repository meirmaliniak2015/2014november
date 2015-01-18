package com.company;

public class Main {

    public static void main(String[] args) {

        //primitive types
        byte b; //1-bytes   -127  to +128
        short s; // 2-bytes  -32000   +32000
        int x; //4-bytes
        long l; //8-bytes

        float f; //4-bytes
        double d; //8-bytes;

        boolean bool; //1-bit;

        char c; //1-byte

        c = '@';
        s = 10000;

        Dog dog;

        Circle myCircle;

        myCircle = new Circle();
        //a. go find a free spot in the heap.
        //b. mark the spot as taken.
        //c. initialize the object.
        //d. return the object's address in the heap.


        myCircle = new Circle();

        Circle mySecondCircle = new Circle();

        dog = new Dog();
        dog.gender = true;
        dog.isAlive = false;
        dog.breed = 100;
        dog.color = 0xff000000;
        dog.bark();



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