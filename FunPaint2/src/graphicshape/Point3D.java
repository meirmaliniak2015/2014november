package graphicshape;

/**
 * Created by eladlavi on 2/1/15.
 */
public class Point3D extends Point {

    private int zPos;

    public Point3D(int xPos, int yPos, int zPos) {
        super(xPos, yPos);
        setzPos(zPos);
    }

    public int getzPos() {
        return zPos;
    }

    public void setzPos(int zPos) {
        this.zPos = zPos;
    }

    @Override
    String components() {
        return super.components() + "," + zPos;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)){
            if(obj instanceof Point3D){
                Point3D other = (Point3D)obj;
                return this.getzPos()==other.getzPos();
            }
        }
        return false;
    }
}
