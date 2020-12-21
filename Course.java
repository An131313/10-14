package course;

public class Course {
	private String courseName = "";
	String[] students = new String[100];
	private int numberOfStudents = 0;

	public Course(String string) {
		this.courseName = string;
	}

	public String getCourseName() {
		return courseName;
	}
	
	public void courseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent (String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public void dropStudent (String student) {
		int index = -1;
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				index = i;
				break;
			}
		}
		
		if (index != -1) {
			for (int j = index; j < numberOfStudents; j++) {
				students[j] = students[j+1];
			}
			numberOfStudents--;
		}
	}
	
	public String getStudents() {
		String result = "";
		for(int i = 0; i < numberOfStudents; i++) {
			if (!result.equals("")) {
				result += ", ";
			}
			result += students[i];
		}
		return result;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
}
