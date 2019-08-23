package RPG;

public class Weapon extends Item{

	private int w_dmg;
	Weapon(String name){
		super(name);
	}
	public void setWDmg(int d){
		w_dmg = d;
	}
	public int getWDmg(){
		return w_dmg;
	}
}
