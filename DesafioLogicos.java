package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// Se os dois trabalhos derem certo, comprarei uma tv de 50 polegadas e todos tomam sorvete.
		// Se apenas 1 trabalho der certo, comprarei uma tv de 32 polegadas e todos tomam sorvete
	    // Se nenhum trabalho der certo, não tem Tv nem sorvete.
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv30 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou Tv 50\"? " + comprouTv50);
		System.out.println("Comprou Tv 30\"? " + comprouTv30);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		System.out.println("Mais saudável?" + maisSaudavel);
	
	}


}
