package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerService {

	void add(Player player) throws NumberFormatException, RemoteException;
	void update(Player player);
	void delete(Player player);
	
}
