package fan;

public class Fan {

	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	
	private int speed = SLOW;
	private boolean switchedOn = false;
	private double radius = 5;
	private String color = "Blue";
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed <= SLOW) {
			this.speed = SLOW;
		} else if(speed >= FAST) {
			this.speed = FAST;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isSwitchedOn() {
		return switchedOn;
	}
	
	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn = switchedOn;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Fan() { //empty constructor
	
	}
	
	public String toString() {
		String result = "";
		if (switchedOn) {
			result += "Speed is " + this.speed;
			result +=  ", color is " + this.color;
			result += ", radius is " + this.radius;
			result += ", the fan is on.";
		} else {
			result += "Color is " + this.color + ", radius is " + this.radius + ", the fan is off.";
		}
		return result;
	}
	
}
