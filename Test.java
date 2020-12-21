package overriding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Taeyong", "Bjkss", "853333445544", "taeyong@todoroki.com");
		System.out.println(p1.toString());
		
		Student s1 = new Student("Jaemin", "Bjkaass", "695222115522", "jaemin@strawberry.com", Student.FRESHMAN);
		System.out.println(s1.toString());
		
		Employee e1 = new Employee("Johnny", "Bjkaass", "55856665", "johnny@chicago.com", "SM nct", 230_000.23);
		System.out.println(e1.toString());
		
		Faculty f1 = new Faculty("Mark", "Bjkaass", "55888558885", "mark@canada.com", "SM nct", 232_323.23, "50", "1");
		System.out.println(f1.toString());
		
		Staff st1 = new Staff("Doyoung", "Bjkaass", "558569985445", "doyoung@bunny.com", "SM nct", 232_323.23, "singer");
		System.out.println(st1.toString());
	}
}
