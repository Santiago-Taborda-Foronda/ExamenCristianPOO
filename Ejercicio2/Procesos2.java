package Ejercicio2;

import javax.swing.JOptionPane;

public class Procesos2 {
	
	public Procesos2() {
		inicio();
		codigos();
	}

	public void inicio() {
		System.out.println("Entro a inicio");
		String nombre= JOptionPane.showInputDialog("Ingrese su nombre");
		int documento= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su documento"));
		int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de telefono actual"));	
		
	}
	public void codigos() {
		String menu="ingrese el codigo \n\n";
		menu+="1. Codigo 1\n";
		menu+="2. Codigo 2\n";
		menu+="3. Codigo 3\n";
		menu+="4. Codigo 4\n";
		menu+="5. Salir\n";
		
		int opc= Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opc) {
		case 1: {
			String ciudad="medellin";
			String fecha= "6 octubre-8am";
			
			break;
		}case 2: {
			String ciudad="bogota";
			String fecha= "10 de noviembre 6 pm";
			break;
		}case 3: {
			String ciudad="cartagena";
			String fecha= "5 de abril 2 pm";
			break;
		}case 4: {
			String ciudad="barranquilla";
			String fecha= "4 de mayo 4 am";
			break;
		}case 5: {
			System.out.println("Usted a salido del sistema ");
			break;
		}
		
	}
	

	}	

}
