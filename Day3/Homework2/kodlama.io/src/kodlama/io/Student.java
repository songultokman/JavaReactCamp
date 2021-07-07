package kodlama.io;

public class Student extends User{

	private String watchedlesson;
	private String comment;
	
	public Student(int id, String firstName, String lastName, String password, String email, String lesson,String comment) {
		super(id, firstName, lastName, password, email);
		this.watchedlesson = lesson;
		this.comment=comment;
	}
	
	public String getLesson() {
		return watchedlesson;
	}

	public void setLesson(String lesson) {
		this.watchedlesson = lesson;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
		
}

	
	
	

	

