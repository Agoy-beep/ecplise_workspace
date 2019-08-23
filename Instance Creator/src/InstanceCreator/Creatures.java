package InstanceCreator;

public class Creatures {

	private String name;
	private int hp;
	private int dmg;
	
	Creatures(String name, int hp, int dmg){
		this.name = name;
		this.hp = hp;
		this.dmg = dmg;
	}
	
	public String getName(){
		return name;
	}
	public int hp(){
		return hp;
	}
	public int dmg(){
		return dmg;
	}
}

