package overriding;

public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String e_mail;
	
	public Person(String name, String address, String phoneNumber, String e_mail){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.e_mail = e_mail;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	//override Object method toString
	public String toString() {
		return "Name: " + name + "\n" + "Address: " + address + "\n" + 
				"Phone number: " + phoneNumber + "\n" + "E-mail: " + e_mail;
	}
}
