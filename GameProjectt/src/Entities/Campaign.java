package Entities;

public class Campaign {

	public int id;
	public String campaignName;
	public double campaignDiscount;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String campaignName, double campaignDiscount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
	
}
