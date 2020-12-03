package polygon;

public class RegularPolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6, 4.0);
		RegularPolygon polygon3 = new RegularPolygon(10, 4.0, 5.6, 7.8);
		
		System.out.println("The perimeter of the first polygon is " + polygon1.getPerimeter());
		System.out.println("The area of the first polygon is " + polygon1.getArea());
		System.out.println("The perimeter of the second polygon is " + polygon2.getPerimeter());
		System.out.println("The area of the second polygon is " + polygon2.getArea());
		System.out.println("The perimeter of the third polygon is " + polygon3.getPerimeter());
		System.out.println("The area of the third polygon is " + polygon3.getArea());
	}
}
