package Concrete;



import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{
	
	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService)
	{
		this.playerCheckService=playerCheckService;
	}

	public void add(Player player)  {
		
		if(playerCheckService.CheckIfRealPerson(player)) {
		System.out.println("Oyuncu kaydedildi "  + player.firstName );
		}else
		{
			System.out.println("Hatali kullanici girisi ");
		}
	}
	
	public void delete(Player player) {
		System.out.println("Oyuncu silindi "  + player.firstName );
	
	}
	
	public void update(Player player) {
		System.out.println("Oyuncu gucellendi "  + player.firstName );
	
	}

}
