
public class Main {

	public static void main(String[] args) {

		Student student = new Student(24, 1234, "Elif", "Yanar", "elif.yanar@gmail.com");
		StudentManager studentmanager = new StudentManager();
		studentmanager.logIn(student);
		studentmanager.register(student);

		System.out.println();
		Instructor ınstructor = new Instructor(15, "engin.demirog@gmail.com", "Engin", "Demiroğ");
		InstructorManager instructormanager = new InstructorManager();
		instructormanager.logIn(ınstructor);
		instructormanager.register(ınstructor);

	}
}
