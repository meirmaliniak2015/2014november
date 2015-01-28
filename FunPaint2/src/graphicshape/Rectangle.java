package graphicshape;

/**
 * Created by eladlavi on 1/28/15.
 */
public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int width, int height){
        setWidth(width);
        setHeight(height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height>0)
            this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width>0)
            this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}
