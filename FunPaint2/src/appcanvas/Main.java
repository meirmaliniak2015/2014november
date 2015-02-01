package appcanvas;


import graphicshape.*;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        System.out.println(p1.equals(p2));

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