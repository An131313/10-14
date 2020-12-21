package course;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Course course1 = new Course("Data Structures");
	Course course2 = new Course("Database Systems");
	
	course1.addStudent("Peter Jones");
	course1.addStudent("Kim Smith");
	course1.addStudent("Anne Kennedy");
	course2.addStudent("Peter Jones");
	course2.addStudent("Steve Smith");
	
	System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
	
	System.out.println(course1.getStudents());
	
	course1.dropStudent("Peter Jones");
	
	System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
	
	System.out.println(course1.getStudents());
	
	//String students = course1.getStudents();
	
	/*for (int i = 0; i < course1.getNumberOfStudents(); i++) {
		System.out.println(students[i] + ", ");
		System.out.println();
		System.out.print("Number of students in course2: "
		+ course2.getNumberOfStudents());
	}
	*/
	
	}
}
