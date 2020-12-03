package tv;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV();
		tv1.turnOn();
		System.out.println(tv1.isTvOn());
		System.out.println("The current channel is " + tv1.channel);
		System.out.println("The current volume is " + tv1.volumeLevel);
		tv1.channelDown();
		System.out.println("The current channel is " + tv1.channel);
		tv1.setChannel(100);
		System.out.println("The current channel is " + tv1.channel);
		tv1.setVolume(1);
		tv1.volumeDown();
		System.out.println("The current volume is " + tv1.volumeLevel);
		tv1.turnOff();
		System.out.println(tv1.isTvOn());
	}
}
