package geometricObject;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input side a of the triangle.");
		double a = sc.nextDouble();
		System.out.println("Input side b of the triangle.");
		double b = sc.nextDouble();
		System.out.println("Input side c of the triangle.");
		double c = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Input color of the triangle.");
		String color = sc.nextLine();
		System.out.println("The triangle is filled (true/false)");
		boolean isFilled = sc.nextBoolean();
		
		Triangle tr1 = new Triangle(a, b, c);
		tr1.setColor(color);
		tr1.setFilled(isFilled);
		System.out.println(tr1.toString() + "\n" + tr1.printTriangle());
		System.out.println("Area = " + tr1.getArea() + "\n" + "Perimeter = " + tr1.getPerimeter());
	}
}
