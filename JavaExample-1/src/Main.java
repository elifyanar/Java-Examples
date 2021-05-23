
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Category category= new Category();
		category.name="Software";
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.addToCategory(category);
		
		Educator educator1 = new Educator("Engin", "Demiro�", "C# + Angular");
		Educator educator2 = new Educator("Engin", "Demiro�", "Java + React");
		Educator educator3 = new Educator("Engin", "Demiro�", "Programlamaya Giri� i�in Temel Kurs");
		
		
		EducatorManager educatorManager=new EducatorManager();
		educatorManager.information(educator1);
		educatorManager.information(educator2);
		educatorManager.information(educator3);
		
		Recording recording=new Recording("Elif Yanar","elifyanar@gmail.com",1234, 1234);
		Recording[] record= {recording};
		for(Recording re: record) {
			System.out.println("Name and Surname : " + re.name);
            System.out.println("Password : " + re.password);
            System.out.println("E-Mail " + re.email);
		}
		
		RecordingManager recordingManager=new RecordingManager();
		recordingManager.addtoStudent(recording);
		

	}

}
