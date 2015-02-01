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
}
