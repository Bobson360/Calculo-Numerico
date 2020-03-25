package math;

public class Math {
	
	public static double pow(double base, int pow) {
		double Base = 1.0;
		for(int i = 0; i < pow; i++) {
			Base*=base;
		}
//		System.out.println();
//		System.out.println("potencia: " + Base);
//		System.out.println();
		return Base;
	}
	
	public static int pow(int base, int pow) {
		int Base = 1;
		for(int i = 0; i < pow; i++) {
			Base*=base;
		}
		return Base;
	}
	
	public static double abs(double abs) {
		if(abs < 0)
			return abs * (-1);
		return abs;
	}

}
