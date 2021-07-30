package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameSaleService {

	void gameSell(Player player, Game game, Campaign campaign );
}
