import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Piensa un numero del uno al diez y escibelo en letras. PD. NO estoy mirando!!!");
		
		switch(numero) {
			case "Uno": JOptionPane.showMessageDialog(null, "Tu numero es el uno");
			break;
			case "Dos": JOptionPane.showMessageDialog(null, "Tu numero es el dos");
			break;
			case "Tres": JOptionPane.showMessageDialog(null, "Tu numero es el tres");
			break;
			case "Cuatro": JOptionPane.showMessageDialog(null, "Tu numero es el cuatro");
			break;
			case "Cinco": JOptionPane.showMessageDialog(null, "Tu numero es el cinco");
			break;
			case "Seis": JOptionPane.showMessageDialog(null, "Tu numero es el seis");
			break;
			case "Siete": JOptionPane.showMessageDialog(null, "Tu numero es el siete");
			break;
			case "Ocho": JOptionPane.showMessageDialog(null, "Tu numero es el ocho");
			break;
			case "Nueve": JOptionPane.showMessageDialog(null, "Tu numero es el nueve");
			break;
			case "Diez": JOptionPane.showMessageDialog(null, "Tu numero es el diez");
			break;
			
			case "uno": JOptionPane.showMessageDialog(null, "Tu numero es el uno");
			break;
			case "dos": JOptionPane.showMessageDialog(null, "Tu numero es el dos");
			break;
			case "tres": JOptionPane.showMessageDialog(null, "Tu numero es el tres");
			break;
			case "cuatro": JOptionPane.showMessageDialog(null, "Tu numero es el cuatro");
			break;
			case "cinco": JOptionPane.showMessageDialog(null, "Tu numero es el cinco");
			break;
			case "seis": JOptionPane.showMessageDialog(null, "Tu numero es el seis");
			break;
			case "siete": JOptionPane.showMessageDialog(null, "Tu numero es el siete");
			break;
			case "ocho": JOptionPane.showMessageDialog(null, "Tu numero es el ocho");
			break;
			case "nueve": JOptionPane.showMessageDialog(null, "Tu numero es el nueve");
			break;
			case "diez": JOptionPane.showMessageDialog(null, "Tu numero es el diez");
			break;
			
			default: JOptionPane.showMessageDialog(null, "Tramposo tu numero no es del uno al diez o lo has escrito mal");
			
		}
	}

}
