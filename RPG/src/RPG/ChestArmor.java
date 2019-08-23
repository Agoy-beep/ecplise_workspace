package RPG;

public class ChestArmor extends Item implements Armor {

	private int a_dmgmitbase;
	private float a_dmgmittotal;
	
	ChestArmor(String name){
		super(name);
		a_dmgmitbase = 6;
	}
	public float calcImpact(Item i){
		int dur = i.getDurability();
		int dmg = a_dmgmitbase;
		a_dmgmittotal = dmg * dur/100;
		return a_dmgmittotal;
	}
	
}