import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

	private static ArrayList<String> panaderia;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		
		ArrayList<String> Pescateria = new ArrayList();
		
			Pescateria.add("Bacalao");
			Pescateria.add("Gambas");
			Pescateria.add("Mejillones");
		
		ArrayList<String> Panaderia = new ArrayList();
		
			Panaderia.add("Donuts");
			Panaderia.add("Pan");
			Panaderia.add("Bollicaos");
		
		ArrayList<String> Fruteria = new ArrayList();
		
			Fruteria.add("Manzanas");
			Fruteria.add("Peras");
			Fruteria.add("Platanos");
		
		ArrayList<String> Carniceria = new ArrayList();
		
			Carniceria.add("Salchichas");
			Carniceria.add("Pollo");
			Carniceria.add("Hamburguesas");
			
		ArrayList<ArrayList<String>> ListaCompra = new ArrayList();
			
			ListaCompra.add(Pescateria);
			ListaCompra.add(Panaderia);
			ListaCompra.add(Fruteria);
			ListaCompra.add(Carniceria);
			
		String Ver = JOptionPane.showInputDialog("Quiere ver la lista de la compra?");
		
		if(Ver.equalsIgnoreCase("Si")) {
			JOptionPane.showMessageDialog(null, ListaCompra);
		}
		String VerSeccion = JOptionPane.showInputDialog("Que seccion quiere ver exactamente? Opciones: Panaderia, Fruteria, Pescateria, Carniceria");
		
		if(VerSeccion.equalsIgnoreCase("Panaderia")) {
			JOptionPane.showMessageDialog(null, Panaderia);
			String EliminarAñadirSustituirPanaderia = JOptionPane.showInputDialog("Quiere eliminar, añadir o sustituir algo de la lista de la panaderia?");
			
			if(EliminarAñadirSustituirPanaderia.equalsIgnoreCase("si")) {
				String QueQuieresHacerPanaderia = JOptionPane.showInputDialog("Que quiere hacer?");
				if(QueQuieresHacerPanaderia.equalsIgnoreCase("sustituir")) {
					int  QueQuieresSustituirPanaderia = Integer.parseInt(JOptionPane.showInputDialog("Que elemento quieres sustituir? PD: Tiene que ser el numero empezando por el 0"));
					String PorQueLoQuieresSustituirPanaderia = JOptionPane.showInputDialog("Que elemento quieres sustituit por "+QueQuieresSustituirPanaderia);
					Panaderia.set(QueQuieresSustituirPanaderia, PorQueLoQuieresSustituirPanaderia);
					JOptionPane.showMessageDialog(null, Panaderia);
				}
				if(QueQuieresHacerPanaderia.equalsIgnoreCase("añadir")) {
					String QueQuieresAñadirPanaderia = JOptionPane.showInputDialog("Que Quieres añadir?");
					Panaderia.add(QueQuieresAñadirPanaderia);
					JOptionPane.showMessageDialog(null, Panaderia);
				}
				if(QueQuieresHacerPanaderia.equalsIgnoreCase("eliminar")) {
					int  QueQuieresEliminarPanaderia = Integer.parseInt(JOptionPane.showInputDialog("Que elemento quieres eliminar? PD: Tiene que ser el numero empezando por el 0"));
					Panaderia.remove(QueQuieresEliminarPanaderia);
					JOptionPane.showMessageDialog(null, Panaderia);
				}
				
			}
			
		}
			else if(VerSeccion.equalsIgnoreCase("Fruteria")) {
				JOptionPane.showMessageDialog(null, Fruteria);
				String EliminarAñadirSustituirFruteria = JOptionPane.showInputDialog("Quiere eliminar, añadir o sustituir algo de la lista de la fruteria?");
				
				if(EliminarAñadirSustituirFruteria.equalsIgnoreCase("si")) {
					String QueQuieresHacerFruteria = JOptionPane.showInputDialog("Que quiere hacer?");
					if(QueQuieresHacerFruteria.equalsIgnoreCase("sustituir")) {
						int  QueQuieresSustituirFruteria = Integer.parseInt(JOptionPane.showInputDialog("Que elemento quieres sustituir? PD: Tiene que ser el numero empezando por el 0"));
						String PorQueLoQuieresSustituirFruteria = JOptionPane.showInputDialog("Que elemento quieres sustituit por "+QueQuieresSustituirFruteria);
						Fruteria.set(QueQuieresSustituirFruteria, PorQueLoQuieresSustituirFruteria);
						JOptionPane.showMessageDialog(null, Fruteria);
					}
					if(QueQuieresHacerFruteria.equalsIgnoreCase("añadir")) {
						String QueQuieresAñadirFruteria = JOptionPane.showInputDialog("Que Quieres añadir a la lista de la Fruteria?");
						Fruteria.add(QueQuieresAñadirFruteria);
						JOptionPane.showMessageDialog(null, Fruteria);
					}
					if(QueQuieresHacerFruteria.equalsIgnoreCase("eliminar")) {
						int  QueQuieresEliminarFruteria = Integer.parseInt(JOptionPane.showInputDialog("Que elemento quieres eliminar? PD: Tiene que ser el numero empezando por el 0"));
						Fruteria.remove(QueQuieresEliminarFruteria);
						JOptionPane.showMessageDialog(null, Fruteria);
					}
					
				}
			}
			else if(VerSeccion.equalsIgnoreCase("Pescateria")) {
				JOptionPane.showMessageDialog(null, Pescateria);
				String EliminarAñadirSustituirPescateria = JOptionPane.showInputDialog("Quiere eliminar, añadir o sustituir algo de la lista de la pescateria?");
				
				if(EliminarAñadirSustituirPescateria.equalsIgnoreCase("si")) {
					String QueQuieresHacerPescateria = JOptionPane.showInputDialog("Que quiere hacer?");
					if(QueQuieresHacerPescateria.equalsIgnoreCase("sustituir")) {
						int  QueQuieresSustituirPescateria = Integer.parseInt(JOptionPane.showInputDialog("Que elemento quieres sustituir? PD: Tiene que ser el numero empezando por el 0"));
						String PorQueLoQuieresSustituirPescateria = JOptionPane.showInputDialog("Que elemento quieres sustituit por "+QueQuieresSustituirPescateria);
						Pescateria.set(QueQuieresSustituirPescateria, PorQueLoQuieresSustituirPescateria);
						JOptionPane.showMessageDialog(null, Pescateria);
					}
					if(QueQuieresHacerPescateria.equalsIgnoreCase("añadir")) {
						String QueQuieresAñadirPescateria = JOptionPane.showInputDialog("Que Quieres añadir a la lista de la Pescateria?");
						Pescateria.add(QueQuieresAñadirPescateria);
						JOptionPane.showMessageDialog(null, Fruteria);
					}
					if(QueQuieresHacerPescateria.equalsIgnoreCase("eliminar")) {
						int  QueQuieresEliminarPescateria = Integer.parseInt(JOptionPane.showInputDialog("Que elemento quieres eliminar? PD: Tiene que ser el numero empezando por el 0"));
						Pescateria.remove(QueQuieresEliminarPescateria);
						JOptionPane.showMessageDialog(null, Pescateria);
					}
					
				}
			}
			else if(VerSeccion.equalsIgnoreCase("Carniceria")) {
				JOptionPane.showMessageDialog(null, Carniceria);
				String EliminarAñadirSustituirCarniceria = JOptionPane.showInputDialog("Quiere eliminar, añadir o sustituir algo de la lista de la carniceria?");
				
				if(EliminarAñadirSustituirCarniceria.equalsIgnoreCase("si")) {
					String QueQuieresHacerCarniceria = JOptionPane.showInputDialog("Que quiere hacer?");
					if(QueQuieresHacerCarniceria.equalsIgnoreCase("sustituir")) {
						int  QueQuieresSustituirCarniceria = Integer.parseInt(JOptionPane.showInputDialog("Que elemento quieres sustituir? PD: Tiene que ser el numero empezando por el 0"));
						String PorQueLoQuieresSustituirCarniceria = JOptionPane.showInputDialog("Que elemento quieres sustituit por "+QueQuieresSustituirCarniceria);
						Carniceria.set(QueQuieresSustituirCarniceria, PorQueLoQuieresSustituirCarniceria);
						JOptionPane.showMessageDialog(null, Carniceria);
					}
					if(QueQuieresHacerCarniceria.equalsIgnoreCase("añadir")) {
						String QueQuieresAñadirCarniceria = JOptionPane.showInputDialog("Que Quieres añadir a la lista de la Carniceria?");
						Carniceria.add(QueQuieresAñadirCarniceria);
						JOptionPane.showMessageDialog(null, Carniceria);
					}
					if(QueQuieresHacerCarniceria.equalsIgnoreCase("eliminar")) {
						int  QueQuieresEliminarCarniceria = Integer.parseInt(JOptionPane.showInputDialog("Que elemento quieres eliminar? PD: Tiene que ser el numero empezando por el 0"));
						Carniceria.remove(QueQuieresEliminarCarniceria);
						JOptionPane.showMessageDialog(null, Carniceria);
					}
					
				}
			}
		
			
		
		
		
			
		

	}

}
