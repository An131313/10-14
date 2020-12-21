package myPoint;

import java.lang.Math;

public class MyPoint {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public MyPoint(){
		
	}
	
	public MyPoint( double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyPoint point) {
		double a = x - point.getX();
		double b = y - point.getY();
		double distance = Math.sqrt(Math.pow( a, 2) + Math.pow( b, 2));
		return distance;
	}
	
	public double distance( double z, double t) {
		double a = x - z;
		double b = y - t;
		double distance = Math.sqrt(Math.pow( a, 2) + Math.pow( b, 2));
		return distance;
	}
	
	public static double distance (MyPoint point1, MyPoint point2) {
		double a = point1.getX() - point2.getX();
		double b = point1.getY() - point2.getY();
		double distance = Math.sqrt(Math.pow( a, 2) + Math.pow( b, 2));
		return distance;
	}
}
