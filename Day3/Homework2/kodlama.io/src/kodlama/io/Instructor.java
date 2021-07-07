package kodlama.io;

public class Instructor extends User{

	private String givenCourse;
	private String givenHomework;

	public Instructor()
	{
		
	}
	public Instructor(int id, String firstName, String lastName, String password, String email, String course,String givenHomework) {
		super(id, firstName, lastName, password, email);
		this.givenCourse = course;
		this.givenHomework=givenHomework;
	}
	public String getGivenCourse() {
		return givenCourse;
	}
    public void setCourse(String course) {
		this.givenCourse = course;
	}
	public String getGivenHomework() {
		return givenHomework;
	}
	public void setGivenHomework(String givenHomework) {
		this.givenHomework = givenHomework;
	}
	 
}
