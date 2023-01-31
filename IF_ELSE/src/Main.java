import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cual es tu edad: ");
		Integer edad = scanner.nextInt();
		
		if(edad >= 75) {
			System.out.println("eres un yay@");
			
		}
			
			else if(edad >= 18 ) {
				System.out.println("eres mayor de edad");
			}
		
			else {
				System.out.println("Eres menor de edad");
			}
		

	}

}
