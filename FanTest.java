package fan;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan1 = new Fan();
		fan1.setSpeed(fan1.FAST);
		fan1.setColor("Yellow");
		fan1.setRadius(10);
		fan1.setSwitchedOn(true);
		
		Fan fan2 = new Fan();
		fan2.setSpeed(2);
		fan2.getColor();
		fan2.getRadius();
		fan2.isSwitchedOn();
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}

}
