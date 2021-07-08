package kodlama.io;

public class InstructorManager extends UserManager {

	public void givenHomeWork(Instructor instructor)
	{
		System.out.println(instructor.getGivenHomework());
	}
	
	public void givenCourse(Instructor instructor)
	{
	     System.out.println(instructor.getFirstName()+ "'nýn verdiði kurslar: "+ instructor.getGivenCourse());
	     
	}
}

