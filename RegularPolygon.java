package polygon;

import java.lang.Math;

public class RegularPolygon {
	private int n = 3;
	private double sideLength = 1;
	private double x = 0; 
	private double y = 0; 
	
	public RegularPolygon() { //empty constructor
		
	}
	
	public RegularPolygon(int z, double t) { //z - broi strani, t - dulzina
		this.setN(z);
		this.setSideLength(t);
	}
	
	public RegularPolygon(int z, double t, double x, double y) { //z - broi strani, t - dulzina
		this.setN(z);
		this.setSideLength(t);
		this.setX(x);
		this.setY(y);
	}

	/*public RegularPolygon(int z, double t) {
		// TODO Auto-generated constructor stub
		this.setN(z);
		this.setSideLength(t);
	}*/

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
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
	
	public double getPerimeter () {
		double perimeter;
		perimeter = this.n * this.sideLength;
		return perimeter;
	}
	
	public double getArea () {
		double area;
		area = (this.n * Math.pow(sideLength, 2)) / ( 4 * Math.tan(Math.PI / n));
		return area;
	}
}
