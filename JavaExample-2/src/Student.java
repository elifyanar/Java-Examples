
public class Student extends User {
	private int studentNumber;
	private String firstName;
	private String lastName;
	
	public Student(int id, int studentNumber, String firstName, String lastName,String eMail) {
		super(id,eMail);
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student() {
		
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
