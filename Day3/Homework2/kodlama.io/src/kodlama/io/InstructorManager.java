package kodlama.io;

public class InstructorManager {

	public void add(Instructor instructor)
	{
		System.out.println("****E�itmen Kay�t Sayfas�******");
		System.out.println(instructor.getId());
		System.out.println(instructor.getFirstName());
		System.out.println(instructor.getLastName());
		System.out.println(instructor.getPassword());       
		System.out.println( instructor.getEmail());	
	}
	
	public void givenCourse(Instructor instructor)
	{
	     System.out.println(instructor.getFirstName()+ "'n�n verdi�i kurslar: "+ instructor.getGivenCourse());
	     
	}
}

