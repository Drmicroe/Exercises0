package fundamentos;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a temperatura em Farenheit: ");
		
		//C° = (F°-32) / 1,8
		double farenheit = scanner.nextDouble();
		double conversao = (farenheit - 32) / 1.8; 
		
		System.out.print("A temperatura em celsius é: " + conversao);
	
		scanner.close(); 
	}
}
