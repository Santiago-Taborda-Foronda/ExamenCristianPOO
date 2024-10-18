import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Proceso {
	ArrayList<String> ListaNombreEmpleado=new ArrayList<String>();
	ArrayList<String> ListaPagoEmpleado=new ArrayList<String>();
	public Proceso() {
		inicio();
		
		
	}
	public void inicio() {
		System.out.println("Inicio proceso");
			
		int num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces que desea hacer el proceso"));
		
		for (int i = 0; i < num; i++) {
			mostrarMenu();
			
		}
			
		
	}
	
	public void mostrarMenu() {
		String menu="ingresa la opcion que deseas \n\n";
		menu+="1. Categoria 1\n";
		menu+="2. Categoria 2\n";
		menu+="3. Categoria 3\n";
		menu+="4. Categoria 4\n";
		menu+="5. Salir\n";
		
		String nombre= JOptionPane.showInputDialog("Ingrese su nombre");
		int salarioActual= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario actual"));
		int opc= Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opc) {
		case 1: {
			double bonificacion = 15;
			double descuento = 0.2;
			double pago=salarioActual+salarioActual*bonificacion-salarioActual*descuento;
			System.out.println(pago);
			break;
		}case 2: {
			double bonificacion = 10;
			double descuento = 0.15;
			double pago=salarioActual+salarioActual*bonificacion-salarioActual*descuento;
			System.out.println(pago);
			break;
		}case 3: {
			double bonificacion = 8;
			double descuento = 0.10;
			double pago=salarioActual+salarioActual*bonificacion-salarioActual*descuento;
			System.out.println(pago);
			break;
		}case 4: {
			int bonificacion = 0;
			int descuento = 0;
			double pago=salarioActual+salarioActual*bonificacion-salarioActual*descuento;
			System.out.println(pago);
			break;
		}case 5: {
			System.out.println("Usted a salido del sistema ");
			break;
		}
	}
		
		
	}
	
	
	
	
}
