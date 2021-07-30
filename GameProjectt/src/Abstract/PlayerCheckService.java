package Abstract;
import Entities.Player;
import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerCheckService {

	boolean CheckIfRealPerson(Player player) ;
}
