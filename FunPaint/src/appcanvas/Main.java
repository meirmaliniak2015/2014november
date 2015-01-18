package appcanvas;


import graphicshape.Circle;
import graphicshape.Circles;

public class Main {

    public static void main(String[] args) {
        "Happy birthday to you!"

        Circle myCircle;

        myCircle = new Circle();
        //a. go find a free spot in the heap.
        //b. mark the spot as taken.
        //c. initialize the object.
        //d. return the object's address in the heap.
        myCircle.setRadius(18);
        //System.out.println(myCircle.getRadius());

        int x = 8;
        int y = x;

        //Access modifiers: (of fields or methods)
        // Public              - can be accessed from anywhere
        // Private             - can be accessed from only within the class
        // Protected & Default - can be accessed from only within the package




        myCircle = new Circle();
        byte r = 12;
        byte g = 14;
        byte b = 18;
        myCircle.fillColor(r, g, b);
        myCircle.fillColor(12.3f, 10f, 15f);


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