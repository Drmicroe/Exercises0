package fundamentos;

public class DesafioResolvido {
	
	public static void main(String[] args) {
		
	double numA = Math.pow(6 * (3 + 2), 2); 
	double denA = 3 * 2;
	double supA = numA / denA;
	
    double numB = Math.pow((1 - 5) * (2 - 7), 2);
	double denB = Math.pow(2, 2);
	double supB = numB / denB;
	
	double sup = Math.pow(supA - supB, 3);
	
	double inf = Math.pow(10,3);
	
	double z = sup / inf;
	 
	System.out.println(z);
	
	
	
		
		
	}

}
