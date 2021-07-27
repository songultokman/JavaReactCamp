package kodlama.io;

public class StudentManager extends UserManager {


	public void commentStudent(Student student)
	{
		System.out.println(student.getComment());
	}
	
	public void complatedlesson(Student student)
	{
		System.out.println("Tamamlanan dersler :"+student.getLesson());
	}
}
