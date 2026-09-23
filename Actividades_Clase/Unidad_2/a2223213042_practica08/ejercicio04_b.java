import java.util.Scanner;

public class ejercicio04_b {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion;
		double operando1, operando2, resultado;
		String menu, cadena;
		cadena = "";

		System.out.println("Introduce el valor del operando 1 ");
		operando1 = entrada.nextDouble();
		System.out.println("Introduce el valor del operando 2 ");
		operando2 = entrada.nextDouble();

		menu = " Menu de opciones de Operaciones Basicas \n";
		menu = menu + " 1.- Suma \n";
		menu = menu + " 2.- Multiplicacion \n";
		menu = menu + " 3.- Division \n";
		menu = menu + " Elige una Opcion [1..2..3]\n";
		System.out.println(menu);
		opcion = entrada.nextInt();

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
		System.out.println(cadena);
		entrada.close();
	}
}
