package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		User user=new User(1,"Esra","Karden", "2555 ", "esra@gmail.com");
		
		Student student1=new Student(1,"Songül","Tokman","123456", "song@gmail.com", "C#","Dersler süper");
		Student student2=new Student(2,"Derya","Yaman","99887", "derya@gmail.com", "Java","Çok geliştirici bir kamp ");
		Student student3=new Student(3,"Mizgin","Demir","77845", "mizgin@gmail.com", "C#", "Çok faydalı ");
		
		Instructor instructor=new Instructor(1,"Engin ","Demiroğ","5647","engindemirog@gmail.com", "Java, C#", "Day1/Homework1");
		
		StudentManager studentManager=new StudentManager();
		UserManager userManager=new UserManager();
		InstructorManager instructorManager=new InstructorManager();
		
		Student[] student=new Student[] {student1,student2};
		userManager.addMultiple(student);
		
		studentManager.commentStudent(student2);
		studentManager.complatedlesson(student1);
		
		instructorManager.givenCourse(instructor);
		instructorManager.givenHomeWork(instructor);
        
		System.out.println("****Kuallanıcı İşlemleri****");
		userManager.add(instructor);
		userManager.add(student3);
		userManager.remove(user);
		userManager.update(instructor);
		
		
	}

}
