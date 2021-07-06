package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		User user=new User(1,"Esra","Karden", "2555 ", "esra@gmail.com");
		
		Student student1=new Student(1,"Songül","Tokman","123456", "song@gmail.com", "C#");
		Student student2=new Student(2,"Derya","Yaman","99887", "derya@gmail.com", "Java");
		Student student3=new Student(3,"Mizgin","Demir","77845", "mizgin@gmail.com", "C#");
		
		Instructor instructor=new Instructor(1,"Engin ","Demiroğ","5647","engindemirog@gmail.com", "Java, C#");
		
		StudentManager studentManager=new StudentManager();
		UserManager userManager=new UserManager();
		InstructorManager instructorManager=new InstructorManager();
		
		Student[] student=new Student[] {student1,student2,student3};
		System.out.println("****Öğrenci Kayıt Sayfası******");
		studentManager.addMultiple(student);
		studentManager.complatedlesson(student1);
		
		instructorManager.add(instructor);
		instructorManager.givenCourse(instructor);
        
		System.out.println("****Güncelleme İşlemleri****");
		userManager.remove(user);
		userManager.update(instructor);
		
		System.out.println("****Kullanıcı İşlemleri****");
		userManager.login(user);
		userManager.logout(user);
	}

}
