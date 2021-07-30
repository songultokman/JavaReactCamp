package Concrete;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleService{

	@Override
	public void gameSell(Player player, Game game, Campaign campaign) {
		 double discountedPrice=game.getGamePrice()-(game.getGamePrice()*campaign.getCampaignDiscount()/100);
		 System.out.println(player.getFirstName()+" isimli oyuncu "+game.getGamePrice()+" fiyatindaki" + game.getGameName()+ " oyunu "
		 +"% "+campaign.getCampaignDiscount() + " indirimle " +discountedPrice  + " fiyatina satiyor " );
		
	}

	
}
