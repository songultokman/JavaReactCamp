package kodlama.io;

public class UserManager {
  
	public void remove(User user)
	{
		System.out.println(user.getFirstName()+ " "+ "Silindi ");
	}
	public void update(User user)
	{
		System.out.println(user.getFirstName()+ " "+ "Güncellendi ");
	}
	
	public void login(User user)
	{
		
		System.out.println(user.getFirstName()+" " + user.getLastName()+ " Giriþ Yaptýnýz");
	}
	public void logout(User user)
	{
		
		System.out.println("Çýkýþ yaptýnýz");
    }
}
