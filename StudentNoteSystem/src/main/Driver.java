package main;

import util.Course;
import util.Student;
import util.Teacher;

public class Driver {

	public static void main(String[] args) {
		
		Course math = new Course("Mathematics", "MATH101", "MATH");
        Course physics = new Course("Physics", "PHS101", "PHS");
        Course chemistry = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MATH");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "PHS");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHEM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", math, physics, chemistry);
        s1.addExamNotes(50,20,40);
        s1.addQuizNotes(25,50,75);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", math, physics, chemistry);
        s2.addExamNotes(100,50,40);
        s2.addQuizNotes(75,50,25);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", math, physics, chemistry);
        s3.addExamNotes(50,20,40);
        s3.addQuizNotes(30, 60, 90);
        s3.isPass();
	}
}
