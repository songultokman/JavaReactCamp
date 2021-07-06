package kodlama.io;

public class StudentManager {

	public void add(Student student)
	{
		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getPassword());       
		System.out.println( student.getEmail());	
	}
	public void addMultiple(Student[] students) {
		for(Student student: students) {
			  add(student);  
		  }
	}
	public void complatedlesson(Student student)
	{
		System.out.println("Tamamlanan dersler :"+student.getLesson());
	}
}
