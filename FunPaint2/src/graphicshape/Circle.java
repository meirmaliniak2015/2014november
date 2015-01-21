package graphicshape;

/**
 * Created by eladlavi on 1/14/15.
 */
public class Circle extends Shape {
    private int radius, xPos, yPos;

    //contructor:
    public Circle() {
        this(20,20);
    }

    public Circle(int xPos, int yPos){
        this(xPos, yPos, 10);
    }

    public Circle(int xPos, int yPos, int radius){
        setRadius(radius);
        setXpos(xPos);
        setyPos(yPos);
    }

    //קונסטרקטור הוא מתודה שמופעלת בעת יצירת האובייקט
        //תפקידו לקבוע ערכים התחלתיים לשדות של האובייקט
        //בנאי ניתן להפעיל רק פעם אחת
        //בנאי מופעל רק עם המילה השמורה new



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
        if(xPos>=0)
            this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        if(yPos>=0)
            this.yPos = yPos;
    }

    public double area(){
        return radius*radius*3.14;
    }


    // signature : fillColor byte byte byte
    public void fillColor(byte red, byte green, byte blue){
        System.out.println("fillColor using rgb");

    }

    public void fillColor(float saturation, float hue, float brightness){
        System.out.println("fillColor using saturation");
    }

}
