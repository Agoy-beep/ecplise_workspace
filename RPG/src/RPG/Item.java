package RPG;

public class Item {

	private double weight;
	private int durability;
	private String i_name;
	Item(String name){
		durability = 100;
		this.i_name = name;
	}
	public void setWeight(double w){
		weight = w;
	}
	public double getWeight(){
		return weight;
	}
	public void setDurability(int d){
		durability = d;
	}
	public int getDurability(){
		return durability;
	}
	public String getIName(){
		return i_name;
	}
}
