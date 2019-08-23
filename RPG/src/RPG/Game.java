package RPG;
import java.util.*;

public class Game {

	private ArrayList<Creature> enemies = new ArrayList<Creature>();
	private ArrayList<Item> worlditems = new ArrayList<Item>();
	private Scanner input = new Scanner(System.in);
	//overloading
	public void addToWItems(OneHandedSword ohs){
		worlditems.add(ohs);
		System.out.println("Loaded" + ohs.getIName());
	}
	public void AddToWItems(ChestArmor ca){
		worlditems.add(ca);
		System.out.println("Loaded" + ca.getIName());
	}
	public void addToEnemies(Goblin g){
		enemies.add(g);
		System.out.println("Loaded . g.getCName()");
	}
	public void addToEnemies(Imp i){
		enemies.add(i);
		System.out.println("Loaded" + i.getCName());
	}
	//Main Menu
	public void RunMenu(){
		System.out.printf("%nCHOOSE: %n1)THE ARENA%n2)AN ADVENTURE%n3)QUIT%n%n");
		String menuchoice = input.nextLine();
		switch(menuchoice){
		case"1":
			runArena();
			break;
		case"2":
			runAdventure();
			break;
		case"3":
			runQuit();
			break;
		}
	}
	public void runArena(){
		System.out.println("You've entered the arena!");
	}
	public void runAdventure(){
		System.out.println("Going on an adventure!");
	}
	public void runQuit(){
		System.out.println("Thanks for playing!");
	}
}
