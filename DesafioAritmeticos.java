package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int m = 2 + 3 * 4;
		int n = (int) Math.pow(m, 3);
		
		System.out.println(n);
		
		int a = 6 * (3 + 2);
		int b = (int) Math.pow(a, 2);
		int c = b / 3 * 2;
		
		int d = (1 - 5) * (2 - 7);
		int e = d / 2;
		int f = (int) Math.pow(e, 2);
		
		int g = c - f;
		int h = (int) Math.pow(g, 3);
		
		int i = 10;
		int j = (int) Math.pow(i, 3);
		
		int k = h / j;
		System.out.println(k);
			
	
	}

}
