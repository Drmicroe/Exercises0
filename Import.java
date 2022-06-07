package fundamentos;

import java.util.Date;

//import javax.swing.JButton;//

public class Import {
	
	public static void main(String[] args) {
		
		//String s = "Bom dia!";
		//System.out.println(s);
	
		Date d = new Date();
		System.out.println(d);
		
		//JButton botao = new JButton()
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
	}
	

}
