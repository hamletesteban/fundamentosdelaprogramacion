import javax.swing.JOptionPane;

public class ejercicio04_c {
	public static void main(String[] args) {
		int opcion;
		double operando1, operando2, resultado;
		String menu, cadena;
		cadena = "";

		operando1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del operando 1 "));
		operando2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del operando 2 "));

		menu = " Menu de opciones de Operaciones Basicas \n";
		menu = menu + " 1.- Suma \n";
		menu = menu + " 2.- Multiplicacion \n";
		menu = menu + " 3.- Division \n";
		menu = menu + " Elige una Opcion [1..2..3]";
		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

		switch (opcion) {
		case 1:
			resultado = operando1 + operando2;
			cadena = "el resultado de la suma es : " + String.valueOf(resultado);
			break;
		case 2:
			resultado = operando1 * operando2;
			cadena = "el resultado de la multiplicacion es : " + String.valueOf(resultado);
			break;
		case 3:
			resultado = operando1 / operando2;
			cadena = "el resultado de la division es : " + String.valueOf(resultado);
			break;
		default:
			cadena = "opcion no reconocida ";
		}
		JOptionPane.showMessageDialog(null, cadena);
	}
}
