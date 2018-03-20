
package testregularpolygon;


public class TestRegularPolygon {

    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        
        RegularPolygon poly2 = new RegularPolygon(8,12,0.0,0.0);
        RegularPolygon poly3 = new RegularPolygon(8,12,4.0,2.0);
        
        System.out.println("perimeter is " + poly1.getPerimeter());
        System.out.println("area is "+ poly1.getArea());
        System.out.println("center is " + poly1.getCenter().toString());
        System.out.println();
        System.out.println("perimeter is " + poly3.getPerimeter());
        System.out.println("area is "+ poly3.getArea());
        System.out.println("center is " + poly3.getCenter().toString());
        
        
    }
    
}
