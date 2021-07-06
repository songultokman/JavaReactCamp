package kodlama.io;

public class Instructor extends User{

	private String givenCourse;

	public Instructor()
	{
		
	}
	public Instructor(int id, String firstName, String lastName, String password, String email, String course) {
		super(id, firstName, lastName, password, email);
		this.givenCourse = course;
		
	}
	public String getGivenCourse() {
		return givenCourse;
	}
    public void setCourse(String course) {
		this.givenCourse = course;
	}
	 
}
