
public class InstructorManager extends UserManager {
	public void logIn(Instructor instructor) {
		System.out.println(instructor.getId()+" "+instructor.geteMail()+" "+instructor.getFirstName()+" "+instructor.getLastName()+"-> Successful login.");
	}
	public void logOut(Instructor instructor) {
		System.out.println("Successful logout.");
	}
}
