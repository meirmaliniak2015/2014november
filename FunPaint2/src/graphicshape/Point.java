package graphicshape;

/**
 * Created by eladlavi on 2/1/15.
 */
public class Point {
    private int xPos;
    private int yPos;
    public Point(int xPos, int yPos){
        setxPos(xPos);
        setyPos(yPos);
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "("+components()+")";
    }

    String components(){
        return xPos+","+yPos;
    }
}
