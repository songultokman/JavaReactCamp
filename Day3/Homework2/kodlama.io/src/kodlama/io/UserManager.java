package kodlama.io;

public class UserManager {
  
	public void remove(User user)
	{
		System.out.println(user.getFirstName()+ " "+ "Silindi ");
	}
	public void update(User user)
	{
		System.out.println(user.getFirstName()+ " "+ "G�ncellendi ");
	}
	
	public void login(User user)
	{
		
		System.out.println(user.getFirstName()+" " + user.getLastName()+ " Giri� Yapt�n�z");
	}
	public void logout(User user)
	{
		
		System.out.println("��k�� yapt�n�z");
    }
}
