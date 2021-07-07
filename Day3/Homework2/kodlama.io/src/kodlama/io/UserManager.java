package kodlama.io;

public class UserManager {
  
	
	public void add(User user)
	{
		System.out.println(user.getId());
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getPassword());       
		System.out.println( user.getEmail());	
	}

	public void addMultiple(Student[] students) {
		for(Student student: students) {
			  add(student);  
		  }
	}
		public void remove(User user)
	{
		System.out.println(user.getFirstName()+ " "+ "Silindi ");
	}
	public void update(User user)
	{
		System.out.println(user.getFirstName()+ " "+ "Güncellendi ");
	}
	
}
