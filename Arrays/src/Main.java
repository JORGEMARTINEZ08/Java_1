
public class Main {

	public static void main(String[] args) {
		String[][] coches = new String[3][3];
	
		coches[0][0] = "BMW";
		coches[0][1] = "LAMBORGHINI";
		coches[0][2] = "PORSCHE";
		coches[1][0] = "PAGANI";
		coches[1][1] = "FERRARI";
		coches[1][2] = "AUDI";
		coches[2][0] = "FIAT";
		coches[2][1] = "TOYOTA";
		coches[2][2] = "CORVETTE";
		
		for(int i=0; i<coches.length; i++) {
			System.out.println();
			for(int j=0; j<coches[i].length; j++){
				System.out.println(coches[i][j]); 
		}
			
		}
		

	}

}
