
package testregularpolygon;


public class TestRegularPolygon {

    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        
        RegularPolygon poly2 = new RegularPolygon(8,12,0.0,0.0);
        
        System.out.println("perimeter is " + poly1.getPerimeter());
        System.out.println("area is "+ poly2.getArea());
        System.out.println("center is " + poly1.getCenter().toString());
        
        
    }
    
}
