package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s.replace("X", "Senhora");
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s.concat("!!!");
		s = s.concat("!!!");
		
		System.out.println(s);
		
	}
}
