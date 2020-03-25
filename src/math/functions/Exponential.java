package math.functions;

public class Exponential {
	
	double a;
	double b;
	double c;
	char x;
	int pow;
	
	public Exponential(char x, double a, int pow, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.x = x;
		this.pow = pow;
	}
	
	public static void main(String[] args) {
		Exponential exp = new Exponential('x', 2, 2, 2, 3);
		System.out.println("" + exp.a + exp.x + "^" + exp.pow + " + " + exp.b + exp.x + " + " + exp.c);
	}
}
