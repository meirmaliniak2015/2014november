package appcanvas;

import graphicshape.Circle;
import graphicshape.Shape;

/**
 * Created by eladlavi on 1/18/15.
 */
public class Canvas {
    public void stam(){
        Circle circle = new Circle();
        System.out.println(circle.area());

    }

    public static double sum(Shape[] shapes){
        double sum = 0;
        for(Shape s : shapes)
            sum += s.area();
        return sum;
    }

}
