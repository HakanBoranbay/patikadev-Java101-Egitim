package util;

public class Course {

	String name;
	String code;
	String prefix;
	int examNote;
	int quizNote;
	Teacher teacher;
	
	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.examNote = 0;
		this.quizNote = 0;
	}
	
	public void addTeacher(Teacher teacher) {
		if (this.prefix.equals(teacher.branch)) {
			this.teacher = teacher;
			System.out.println("Teacher of course " + this.name + " is now " + teacher.name + ".");
		} else {
			System.out.println("Course and Teacher do not match.");
		}
	}
	
	public void printTeacher() {
		if (teacher != null) {
			System.out.println(this.name + " teacher is " + teacher.name);
		} else {
			System.out.println(this.name + " course has no teacher yet.");
		}
	}
}
