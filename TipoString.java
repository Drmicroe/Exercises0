package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
	System.out.println("Olá pessoal".charAt(2)); //Procurar uma letra específica. Número 2 indica a posição 2 da frase, no caso a letra "á"//
		
		String s = "Boa tarde";
		s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.length());
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
	
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	
	}	
	
}
	
	

