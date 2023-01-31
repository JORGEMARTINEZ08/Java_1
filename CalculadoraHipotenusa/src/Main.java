import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double resultado;
		
		System.out.println("Cual es el valor x del triangulo?");
		double x = scanner.nextDouble();
		
		System.out.println("Cual es el valor y del triangulo?");
		double y = scanner.nextDouble();
		
	
		resultado = Math.sqrt((x*x)+(y*y));
		
		System.out.println("La hipotenusa del triangulo x,y es = " + resultado);
		
		
		
		
		
		
	
		
		
		
	}

}
