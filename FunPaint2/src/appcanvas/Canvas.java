package appcanvas;

import graphicshape.Circle;
import graphicshape.Point;
import graphicshape.Shape;

/**
 * Created by eladlavi on 1/18/15.
 */
public class Canvas {
    private boolean[][] canvas;
    public Canvas(int width, int height){
        canvas = new boolean[width][height];
    }

    public void drawPoint(Point p){
        if(p.getyPos()<canvas.length && p.getxPos()<canvas[0].length){
            canvas[p.getyPos()][p.getxPos()] = true;
        }
    }

    public void drawCanvas(){
        for (int i = 0; i < canvas.length; i++) {
            System.out.println();
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j] ? "*" : " ");
            }
        }
    }






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
