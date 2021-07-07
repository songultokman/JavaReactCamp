package kodlama.io;

public class StudentManager {


	public void commentStudent(Student student)
	{
		System.out.println(student.getComment());
	}
	
	public void complatedlesson(Student student)
	{
		System.out.println("Tamamlanan dersler :"+student.getLesson());
	}
}
