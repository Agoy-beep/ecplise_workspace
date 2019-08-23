package RPG;

public class Goblin extends Creature {

	Goblin(String name){
		super(name);
		setCHealth(24);
		setCDmg(6);
	}
	public void attack(){
		System.out.println(getCName() + " claws at you!");
	}
}
