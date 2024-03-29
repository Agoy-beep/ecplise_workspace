package RPG;

abstract public class Creature {

	private String c_name;
	private int c_health;
	private int c_dmg;
	
	Creature(String name){
		this.c_name = name;
		c_health = 20;
		c_dmg = 10;
	}
	public String getCName(){
		return this.c_name;
	}
	public void setCHealth(int h){
		this.c_health = h;
	}
	public int getCHealth(){
		return c_health;
	}
	public void setCDmg(int dmg){
		this.c_dmg = dmg;
	}
	public int getCDmg(){
		return c_dmg;
	}
	abstract public void attack();
}
