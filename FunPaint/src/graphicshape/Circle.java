package graphicshape;

/**
 * Created by eladlavi on 1/14/15.
 */
public class Circle extends Shape {
    private int radius, xPos, yPos;


    public Circle() {
        radius = 10;
        xPos = 20;
        yPos = 20;
    }

    @Override
    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = "
                + radius +" and color = " + color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius >= 0)
            this.radius = radius;
    }

    public int getXpos() {
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

    public double area(){
        return radius*radius*3.14;
    }

}
