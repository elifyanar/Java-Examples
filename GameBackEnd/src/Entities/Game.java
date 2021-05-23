package Entities;

public class Game {
	private int Id;
	private String Name;
	private String Category;
    private double Price;
	Campaign campaign;
	
    public Game() {
		super();
	}
	public Game(int id, String name, String category, double price) {
		super();
		Id = id;
		Name = name;
		Category = category;
		Price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
}
