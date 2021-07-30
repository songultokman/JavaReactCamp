
import Abstract.PlayerCheckService;
import Adapter.PlayerController;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		PlayerCheckService playerCheckService=new PlayerController();

		
		Game game=new Game(1, "Farmers", 500);
		
		Campaign campaign=new Campaign(1,"Super Fýrsat", 30 );
		
		Player player1=new Player(1,"5555","Songul", "Tokman", 1995);
		
		
		PlayerManager playerManager=new PlayerManager(new PlayerController());
		playerManager.add(player1);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		
		GameSaleManager gameSaleManager=new GameSaleManager();
		
		if(playerCheckService.CheckIfRealPerson(player1)==true)
		{
			gameSaleManager.gameSell(player1, game, campaign);
		}else
		{
			System.out.println("boyle bir kullanici yok satýs gerçekleþtirilemedi ");
		}
		
		
        
	}

}