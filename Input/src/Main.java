import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name");
		String name = scanner.nextLine();
		
		System.out.println("Hello "+ name);
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		
	    System.out.println("WHOA LIKE ME, IM "+age+" TOO!!!");
	    
	    System.out.println("And what is your favorite food??");
	    String favFood = scanner.nextLine();
	   
	    System.out.println("Nah, i dont like " + favFood + " .I prefer Spaggetii");
	  

	}

}
