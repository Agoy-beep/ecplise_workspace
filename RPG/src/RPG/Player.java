package RPG;
import java.util.*;

public class Player {

	ArrayList<Item> inventory = new ArrayList<Item>();
	ChestArmor [] chest = new ChestArmor [1];
	Weapon [] left_hand = new Weapon [1];
	private double inv_capacity;
	private double inv_weight;
	private boolean eq_chest;
	private boolean eq_ILeftH;
	private int health;
	
	Player(){
		inv_capacity = 70.00;
		eq_chest = false;
		eq_ILeftH = false;
		health = 100;
	}
	public void setHealth(int h){
		health = h;
	}
	public int getHealth(){
		return health;
	}
	public void sumOfWeight (Item i){
		double d = i.getWeight();
		inv_weight = inv_weight + d;
	}
	//each item's weight gets added to the inventory to get a total inv weight (including the item you want to pick up).
	public void calcInvWeight(){
		for (Item i: inventory){
			sumOfWeight(i);
		}
	}
	public void pickUpItem(Item i){
		calcInvWeight();
		sumOfWeight(i);
		if (inv_weight > inv_capacity) {
			System.out.println ("This item is too heavy!");
		}
		else {
			inventory.add(i);
			System.out.println(i.getIName () + " has been added to inventory");
		}
	}
	public void equipItemChest(String name){
		for(Item i: inventory){
			if (name.equals(i.getIName())){
				ChestArmor ca = new ChestArmor(name);
				if (eq_chest == true){
					System.out.println ("Armor swapped!");
					inventory.add(chest[0]);
					chest[0] = ca;
					inventory.remove(ca);
					break;
				}
				else{
					System.out.println("You've put on armor.");
					eq_chest = true;
					chest[0] = ca;
					inventory.remove(ca);
					break;
				}
			}
			else{
				continue;
			}
		}
	}
	public void equipItemLeftH(String name){
		for(Item i: inventory){
			if(name.equals(i.getIName())){
				Weapon w = new Weapon(name);
				if(eq_ILeftH == true){
					System.out.println("You've swapped " + left_hand[0].getIName() + "for" + name);
					inventory.add(left_hand[0]);
					left_hand [0] = w;
					inventory.remove(i);
					break;
				}
				else{
					System.out.println("You've equipped " + name);
					left_hand [0] = w;
					inventory.remove(i);
					eq_ILeftH = true;
					break;
				}
			}
			else{
				continue;
			}
		}
	}
	public void checkInv(){
		for(Item i : inventory){
			System.out.println(i.getIName());
		}
	}
	public void attackLH(){
		System.out.println("You swing " + left_hand[0].getIName() + " and do damage to ....");
	}
}
