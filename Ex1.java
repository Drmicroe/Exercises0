package fundamentos;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		// F° = (celsius * 1.8) + 32
		double conversao = ( celsius * 1.8) + 32;
		
		System.out.print("Valor em farenheit: " + conversao);
		
		scanner.close();
	
	}


}
