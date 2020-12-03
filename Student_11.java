package student_11;

public class Student_11 {
	private String name;
	private double grade;

	public Student_11() { //empty constructor

	}

	public Student_11( String name, double grade) {
		this.setName(name); //concrete object -> this
		this.setGrade(grade);
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
