package kodlama.io;

public class InstructorManager  {

	public void givenHomeWork(Instructor instructor)
	{
		System.out.println(instructor.getGivenHomework());
	}
	
	public void givenCourse(Instructor instructor)
	{
	     System.out.println(instructor.getFirstName()+ "'n�n verdi�i kurslar: "+ instructor.getGivenCourse());
	     
	}
}

