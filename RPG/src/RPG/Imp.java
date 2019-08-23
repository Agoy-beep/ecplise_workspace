package RPG;

public class Imp extends Creature {

	Imp(String name){
		super(name);
		setCHealth(32);
		setCDmg(8);
	}
	public void attack(){
		System.out.println(getCName() + " claws at you!");
	}
}
