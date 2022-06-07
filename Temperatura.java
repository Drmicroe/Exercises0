package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		// (f - 32) * 5/9 = c
		
		final double DIF = 32;
		final double MULT = 5/9.0;
		double f = 86;
		double c = (f - DIF) * MULT;
		System.out.println("O resultado é " + c + "c°");
		
		
		f = 130;
		c = (f - DIF) * MULT;
		System.out.println("O resultado é " + c + "c°");
		
	}
}
