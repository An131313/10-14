package student_11;

import java.util.Scanner;

public class StudentFinancialAid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_11[] students = new Student_11[5]; //creating the array
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 5; i++) {
			System.out.println("Name of student " + i + "?");
			String name = sc.nextLine();
			System.out.println("Grade of student " + i + "?");
			double grade = sc.nextDouble();
			sc.nextLine();
			students[i] = new Student_11( name, grade); 
		}

		displayStudentsEligible(students);

		}

		public static void displayStudentsEligible(Student_11 students[]) {
			for(Student_11 s : students) {
				if( isStudentEligible(s)) {
				System.out.println(s.getName());
				}
			}
		}

		private static boolean isStudentEligible(Student_11 student) {
			return student.getGrade() > 5.50;
		}

}
