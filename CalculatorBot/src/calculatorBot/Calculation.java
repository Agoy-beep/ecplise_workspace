package calculatorBot;

public class Calculation {

	public int getSum(int a, int b) {
		int sum = a + b;
		return(sum);
	}
	public int getSub(int a, int b) {
		int sub = a - b;
		return(sub);
	}
	public int getMult(int a, int b) {
		int mult = a * b;
		return(mult);
	}
	// if a and b ints, div will be int.0 --> a and b must be doubles or floats!
	public double getDiv(double a, double b) {
		double div = a / b;
		return (div);
	}
	public int getMod(int a, int b) {
		int mod = a % b;
		return(mod);
	}
}
