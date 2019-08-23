package calculatorBot;
import java.util.*;

public class Game {

	public Scanner input = new Scanner(System.in);
	
	//Title
	public void runTitle() {
		System.out.println("///////////////");
		System.out.println("/CALCULATORBOT/");
		System.out.println("///////////////");
		runStart();
	}
	//Start Screen
	public void runStart() {
		
		System.out.printf("%n%nSELECT AN OPTION!");
		System.out.printf("%n%n1)START%n%n2)QUIT%n%n");
		String choice = input.nextLine();
		if (choice.equals("1")||choice.equals("2")) {
			switch (choice) {
			case "1":
				runBot();
				
				break;
			case "2":
				runBot();
		
				break;
			}
		}
		else {
			System.out.println("Invalid input");
			runStart();
		}
	}
	// Limitation: only 2 operands
	public void runBot() {
		Calculation c = new Calculation();
		System.out.printf("What would you like me to calculate?%n%n1)SUM%n%n2)SUBTRACTION%n%n3)MULTIPlICATION%n%n4)DIVISION%n%n5)MODULO%n%n");
		String bot_choice = input.nextLine();
		
		if (bot_choice.equals("1")||bot_choice.equals("2")||bot_choice.equals("3")||bot_choice.equals("4")||bot_choice.equals("5")) {
			switch(bot_choice) {
			case"1":
				int a = getOperand1();
				int b = getOperand2();
				System.out.println("I have calculated: " + c.getSum(a,b));
				break;
			case "2":
				int d = getOperand1();
				int e = getOperand2();
				System.out.println("I have calculated: " + c.getSub(d,e));
				break; 
			case "3":
				int f = getOperand1();
				int g = getOperand2();
				System.out.println("I have calculated: " + c.getMult(f,g));
				break; 
			case "4":
				double h = getOperand1();
				double i = getOperand2();
				System.out.println("I have calculated: " + c.getDiv(h, i));
				break;
			case "5":
				int j = getOperand1();
				int k = getOperand2();
				System.out.println("I have calculated: " + c.getMod(j, k));
				break;
			}
		}
	}
	public int getOperand1() {
		System.out.println("Enter first operand:");
		String operand1 = input.nextLine();
		int p1;
		try {
			p1 = Integer.parseInt(operand1);
			
		}
		catch (NumberFormatException e) {
			//If input is invalid, the second input does not override the 0 assigned to p1... -_-
			System.out.println("Invalid input, try again!");
			p1 = getOperand1();

		}
		
		return p1;
	}
	public int getOperand2() {
		System.out.println("Enter second operand:");
		String operand2 = input.nextLine();
		int p2;
		try {
			p2 = Integer.parseInt(operand2);
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid input, try again!");
			p2 = getOperand2();
		}
		return p2;
	}
	public void askAgain() {
		System.out.printf("Would you like me to calculate something else? %n%n 1)YES (please!)%n%n2)NOPE!");
		
	}
	//for debugging purposes
	public void runTxt() {
		System.out.println(" A common mistake that people make when trying to design something completely foolproof is to underestimate the ingenuity of complete fools.");
	}
}
