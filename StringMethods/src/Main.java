import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Cual es tu nombre?");
		
		boolean a = name.equalsIgnoreCase("jorge");
		int b = name.length();
		boolean f = name.isEmpty();
		String c = name.toUpperCase();
		
		
		if(f == false) {
			if (a == true) {
				JOptionPane.showMessageDialog(null, "te llamas igual que yo" );
			}
			else {
			JOptionPane.showMessageDialog(null, "Hello "+name);
			}
			JOptionPane.showMessageDialog(null, name+" tu nombre tiene "+b+" caracteres");	
			if(b == 1) {
				char primer = name.charAt(0);
				JOptionPane.showMessageDialog(null, name+ " La primera y unica letra de tu nombre es la "+ primer);	
				
				
			}
			if (b == 2) {
				char primer = name.charAt(0);
				char segundo = name.charAt(1);
				
				JOptionPane.showMessageDialog(null, name+ ", la primera letra de tu nombre es la "+primer+" y la segunda y ultima letra de tu nombre es la "+segundo );	
			
			}
			if (b == 3) {
				char primer = name.charAt(0);
				char segundo = name.charAt(1);
				char tercer = name.charAt(2);
				
				JOptionPane.showMessageDialog(null, name+ ", la primera letra de tu nombre es la "+primer+", la segunda letra de tu nombre es la "+segundo+", la tercera y ultima letra es la "+tercer  );	
			
			}
			if (b == 4) {
				char primer = name.charAt(0);
				char segundo = name.charAt(1);
				char tercer = name.charAt(2);
				char cuarta = name.charAt(3);
				
				JOptionPane.showMessageDialog(null, name+ ", la primera letra de tu nombre es la "+primer+", la segunda letra de tu nombre es la "+segundo+", la tercera letra es la "+tercer+", la cuarta y ultima letra es la "+cuarta  );	
			
			}
			if (b == 5) {
				char primer = name.charAt(0);
				char segundo = name.charAt(1);
				char tercer = name.charAt(2);
				char cuarta = name.charAt(3);
				char quinta = name.charAt(4);
				
				JOptionPane.showMessageDialog(null, name+ ", la primera letra de tu nombre es la "+primer+", la segunda letra de tu nombre es la "+segundo+", la tercera letra es la "+tercer+", la cuarta letra es la "+cuarta+", la quinta y ultima letra es la "+quinta  );
			
			}
			if (b == 6) {
				char primer = name.charAt(0);
				char segundo = name.charAt(1);
				char tercer = name.charAt(2);
				char cuarta = name.charAt(3);
				char quinta = name.charAt(4);
				char sexta = name.charAt(5);
				
				JOptionPane.showMessageDialog(null, name+ ", la primera letra de tu nombre es la "+primer+", la segunda letra de tu nombre es la "+segundo+", la tercera letra es la "+tercer+", la cuarta letra es la "+cuarta+", la quinta es la: "+quinta+", la sexta y ultima letra es la "+sexta  );
			
			}
			if (b == 7) {
				char primer = name.charAt(0);
				char segundo = name.charAt(1);
				char tercer = name.charAt(2);
				char cuarta = name.charAt(3);
				char quinta = name.charAt(4);
				char sexta = name.charAt(5);
				char septima = name.charAt(6);
				
				JOptionPane.showMessageDialog(null, name+ ", la primera letra de tu nombre es la "+primer+", la segunda letra de tu nombre es la "+segundo+", la tercera letra es la "+tercer+", la cuarta letra es la "+cuarta+", la quinta es la: "+quinta+", la sexta letra es la "+sexta+", la septima y ultima letra es la "+septima  );
			
			}
			
			if (b == 8) {
				char primer = name.charAt(0);
				char segundo = name.charAt(1);
				char tercer = name.charAt(2);
				char cuarta = name.charAt(3);
				char quinta = name.charAt(4);
				char sexta = name.charAt(5);
				char septima = name.charAt(6);
				char octava = name.charAt(7);
				
				JOptionPane.showMessageDialog(null, name+ ", la primera letra de tu nombre es la "+primer+", la segunda letra de tu nombre es la "+segundo+", la tercera letra es la "+tercer+", la cuarta letra es la "+cuarta+", la quinta es la: "+quinta+", la sexta letra es la "+sexta+", la septima letra es la "+septima+", la octava y ultima letra es la "+octava  );
			
			}
			
			if (b == 9) {
				char primer = name.charAt(0);
				char segundo = name.charAt(1);
				char tercer = name.charAt(2);
				char cuarta = name.charAt(3);
				char quinta = name.charAt(4);
				char sexta = name.charAt(5);
				char septima = name.charAt(6);
				char octava = name.charAt(7);
				char novena = name.charAt(8);
				
				JOptionPane.showMessageDialog(null, name+ ", la primera letra de tu nombre es la "+primer+", la segunda letra de tu nombre es la "+segundo+", la tercera letra es la "+tercer+", la cuarta letra es la "+cuarta+", la quinta es la: "+quinta+", la sexta letra es la "+sexta+", la septima letra es la "+septima+", la octava letra es la "+octava+ " la novena y ultima letra es la "+novena  );
			
			}
			if (b == 10) {
				char primer = name.charAt(0);
				char segundo = name.charAt(1);
				char tercer = name.charAt(2);
				char cuarta = name.charAt(3);
				char quinta = name.charAt(4);
				char sexta = name.charAt(5);
				char septima = name.charAt(6);
				char octava = name.charAt(7);
				char novena = name.charAt(8);
				char decima = name.charAt(9);
				
				JOptionPane.showMessageDialog(null, name+ ", la primera letra de tu nombre es la "+primer+", la segunda letra de tu nombre es la "+segundo+", la tercera letra es la "+tercer+", la cuarta letra es la "+cuarta+", la quinta es la: "+quinta+", la sexta letra es la "+sexta+", la septima letra es la "+septima+", la octava letra es la "+octava+ " la novena letra es la "+novena+ ", la decima y ultima letra es la "+decima  );
			
			}
				JOptionPane.showMessageDialog(null, name+ ", tu nombre en mayusculas seria " + c);
				String oldChar = JOptionPane.showInputDialog("Que letra quieres remplazar de tu nombre?");
				String newChar = JOptionPane.showInputDialog("Por cual letra quieres remplazar?");
				String d = name.replace(oldChar, newChar);
				JOptionPane.showMessageDialog(null, "Este seria el resultado de tu nombre. "+d);				 
																				
		}
	}	
}
