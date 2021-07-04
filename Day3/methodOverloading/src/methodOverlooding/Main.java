package methodOverlooding;

public class Main {

	public static void main(String[] args) {
		
		Dortislem dortIslem=new Dortislem();
		
		System.out.println("Toplam= "+ dortIslem.topla(10, 20));
		System.out.println("Toplam= "+ dortIslem.topla(10, 20,30));

	}

}
