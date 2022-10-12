package util;

public class Student {

	String name;
	String studentNo;
	int classes;
	Course course1;
	Course course2;
	Course course3;
	double averageGrade;
	boolean isPass;

	public Student(String name, int classes, String studentNo, Course course1, Course course2, Course course3) {
		this.name = name;
		this.classes = classes;
		this.studentNo = studentNo;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		calculateAverageGrade();
		this.isPass = false;
	}

	public void addExamNotes(int course1, int course2, int course3) {

		if (course1 >= 0 && course1 <= 100) {
			this.course1.examNote = course1;
		}

		if (course2 >= 0 && course2 <= 100) {
			this.course2.examNote = course2;
		}

		if (course3 >= 0 && course3 <= 100) {
			this.course3.examNote = course3;
		}
	}

	public void addQuizNotes(int course1, int course2, int course3) {

		if (course1 >= 0 && course1 <= 100) {
			this.course1.quizNote = course1;
		}

		if (course2 >= 0 && course2 <= 100) {
			this.course2.quizNote = course2;
		}

		if (course3 >= 0 && course3 <= 100) {
			this.course3.quizNote = course3;
		}
	}

	public void isPass() {
		if (this.course1.examNote == 0 || this.course2.examNote == 0 || this.course3.examNote == 0 
				|| this.course1.quizNote == 0 || this.course2.quizNote == 0 || this.course3.quizNote == 0) {
			System.out.println("Notes are not entered.");
		} else {
			this.isPass = isCheckPass();
			printNotes();
			System.out.println("Average grade: " + this.averageGrade);
			if (this.isPass) {
				System.out.println("Passed.");
			} else {
				System.out.println("Failed.");
			}
		}
	}

	public void calculateAverageGrade() {
		this.averageGrade = ((this.course1.examNote + this.course2.examNote + this.course3.examNote) / 3) * (0.8)
				+ ((this.course1.quizNote + this.course2.quizNote + this.course3.quizNote) / 3) * (0.2);
	}

	public boolean isCheckPass() {
		calculateAverageGrade();
		return this.averageGrade > 55;
	}

	public void printNotes() {
		System.out.println("==============================");
		System.out.println("Student : " + this.name);
		System.out.println(course1.name + " grade: " + (this.course1.examNote * 0.8 + this.course1.quizNote * 0.2));
		System.out.println(course2.name + " grade: " + (this.course2.examNote * 0.8 + this.course2.quizNote * 0.2));
		System.out.println(course3.name + " grade: " + (this.course3.examNote * 0.8 + this.course3.quizNote * 0.2));
		System.out.println("==============================");
	}
}