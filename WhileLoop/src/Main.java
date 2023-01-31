import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		 
		String name = "";
		
		while(name.isBlank()) {
		name = JOptionPane.showInputDialog("Enter your name");
		}
		JOptionPane.showConfirmDialog(null, "Hello " +name);
	}

}
