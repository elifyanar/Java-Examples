
public class User {
	private int id;
	public String eMail;
	
	public User() {
	}
	
	public User(int id, String eMail) {
		super();
		this.id = id;
		this.eMail = eMail;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
