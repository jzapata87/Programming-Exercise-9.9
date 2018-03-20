
package testregularpolygon;
import javafx.geometry.Point2D;


public class RegularPolygon {
    private int n;
    private double side;
    private double x = 0.0;
    private double y = 0.0;
    private Point2D center; 
    
    public RegularPolygon(){
        n = 3;
        side = 1.0;
        x = 0.0;
        y = 0.0;
        center = new Point2D(x,y);
        
    }
    
    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
        center  = new Point2D(x,y);
        
    }
    
    public double getPerimeter(){
        return side*n;
    }
    
    public double getArea(){
        return ((n*side*side)/(4*Math.tan(Math.PI/n)));
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }
    
    
    
    
    
}
