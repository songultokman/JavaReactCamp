package Adapter;
import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerController implements PlayerCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) {
		if(player.getFirstName()=="Songül"&& player.getLastName()=="Tokman" && player.getBirthOfDate()==1995 && player.getNationalityId()=="5555")
	{
		return true;
	}
	else {
		return false;
		}
	}

}
