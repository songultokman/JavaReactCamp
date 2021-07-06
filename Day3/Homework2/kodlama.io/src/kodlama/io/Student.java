package kodlama.io;

public class Student extends User{

	private String watchedlesson;
	
	public Student(int id, String firstName, String lastName, String password, String email, String lesson) {
		super(id, firstName, lastName, password, email);
		this.watchedlesson = lesson;
	}
	
	public String getLesson() {
		return watchedlesson;
	}

	public void setLesson(String lesson) {
		this.watchedlesson = lesson;
	}
		
}

	
	
	

	

