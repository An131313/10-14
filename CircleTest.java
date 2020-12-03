package circle;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		System.out.println("Area of c1 = " + c1.getArea());
		
		Circle c2 = new Circle(13);
		System.out.println("Perimeter of c2 = " + c2.getPerimeter());
		
		Circle c3 = new Circle();
		c3.setRadius(3.5);
		System.out.println("Perimeter of c3 = " + c3.getArea());
	}

}
