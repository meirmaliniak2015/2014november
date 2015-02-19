package appcanvas;


import graphicshape.*;

public class Main {

    public static void main(String[] args) {
        Canvas myCanvas = new Canvas(30, 7);

        drawRectangle(4,5,20,6,myCanvas);

        myCanvas.drawCanvas();

        /*
        drawRectangle(3,4,20,7);
        drawRectangle(5,6,20,7);
        */
    }

    /*
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
    */
    public static void drawRectangle(int x, int y, int width, int height, Canvas canvas){

        
        Point p = new Point(x, y);
        canvas.drawPoint(p);

    }
}
/*
* Abstraction
* Encapsulation
* Inheritance
* Polymorphism
*/