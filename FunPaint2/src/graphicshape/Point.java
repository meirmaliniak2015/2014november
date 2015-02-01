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

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof Point){
            Point other = (Point)obj;
            return this.getxPos()==other.getxPos() &&
                    this.getyPos()==other.getyPos();
        }
        return false;
    }
}
