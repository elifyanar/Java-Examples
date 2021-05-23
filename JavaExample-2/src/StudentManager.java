
public class StudentManager extends UserManager{
	public void logIn(Student student) {
		System.out.println(student.getId()+" "+student.getStudentNumber()+" "+student.getFirstName()+
				" "+student.getLastName()+" "+student.geteMail()+"-> Successful login.");
	}
	public void logOut(Student student) {
		System.out.println("Successful logout.");
	}
}
