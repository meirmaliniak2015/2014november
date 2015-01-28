package graphicshape;

/**
 * Created by eladlavi on 1/28/15.
 */
public class Square extends Rectangle {
    public Square(int side){
        super(side, side);
    }
    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }
}
