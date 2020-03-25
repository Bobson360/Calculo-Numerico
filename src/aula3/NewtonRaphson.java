package aula3;
import static math.Math.pow;
import static math.Math.abs;


public class NewtonRaphson {
	
	double x0 = 1;
	static double err = 0.001;
	static double xn = 1.00;
	static int count = 0;
	static double x = 0.00;
	int intervalA;
	int intervalB;

	/*
	 * 
	 * 
	 * f(x) = x⁴ - 2
	 * f`(x) = 4x³
	 * 
	 * xn + 1 = xn - f(x)/f`(x)
	 */
	public static void main(String[] args) throws InterruptedException {
		
		while(abs(x-xn) > err) {
			if(count >0)
				xn = x;
			
			System.out.println("valor de xn " + xn);
			System.out.println();
			System.out.println("f(x) = " + (pow(xn, 4) - 2));
			System.out.println("f`(x) = " + (4.0*pow(xn, 3)));
			System.out.println("x" + (count + 1) + " = " + (xn - (pow(xn,4) - 2)/(4*pow(xn, 3))));
			x = xn - (pow(xn,4) - 2)/(4*pow(xn, 3));
			System.out.println("ERRO = " + abs(x-xn));
			System.out.println();
			count++;
//			System.out.println(x);
//			Thread.sleep(125);
		}
		System.out.println(abs(x-xn));
		System.out.println(count);
	}
	

}

