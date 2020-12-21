package overriding;

import java.util.Date;

public class Staff extends Employee {
	private String title;

	Staff (String name, String address, 
			String phoneNumber, String e_mail,
			String office, double salary,
			String title){
		super( name, address, phoneNumber, e_mail, office, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Title: " + title;
	}
	
}
