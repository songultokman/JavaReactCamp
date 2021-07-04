package reCapDem;

public class main {

	public static void main(String[] args) {
		
		Dortislem dortislem=new Dortislem();
		double sum=dortislem.Sum(12,24);
		double deducation=dortislem.Deduction(10,9);
		double division=dortislem.Division(15, 4);
		double multiplication=dortislem.Multipcilation(10, 7);
		
		System.out.println("Toplam: "+ sum );
		System.out.println("Fark: "+ deducation );
		System.out.println("Çarpým: "+ multiplication );
		System.out.println("Bölüm: "+ division );
		
		
		
		

	}

}
