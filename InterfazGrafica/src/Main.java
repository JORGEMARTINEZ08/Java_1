import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, name + " tienes "+age+" años");
		
		double heigh = Double.parseDouble(JOptionPane.showInputDialog("Enter your heigh"));
		JOptionPane.showMessageDialog(null, name + " tienes "+age+" años y mides "+heigh);
		
		
				

	}

}
