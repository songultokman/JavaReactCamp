package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println( game.gameName+ " Oyunu eklendi ");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.gameName +" Oyunu silindi ");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.gameName +" Oyunu güncellendi ");
		
	}

}
