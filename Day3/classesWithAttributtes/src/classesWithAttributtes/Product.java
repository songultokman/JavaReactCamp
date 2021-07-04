package classesWithAttributtes;

public class Product {

	 private int id;
	  String name;
	  String description;
	  double price;
	  int stockAmount;
	  private String kod;
	
	public int getId() {  // sadece okuyabilir
		return id;
	}
	
	public void setId(int id)  // Deðiþtirip set eder
	{
		this.id=id;
	}

	int getStockAmount() {
		return stockAmount;
	}

	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	public String getKod() {
		return this.name.substring(0,1)+ id;
	}

	


	
}
