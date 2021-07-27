package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

  KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth);
		if(result == true)
		{
			System.out.println("Giriþ basarili");
			return true;
			
		}else {
			System.out.println("Griris basarisiz");
			return false;
		}
		
	}
}
