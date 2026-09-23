import java.util.Scanner;

public class ejercicio03_b {

	public static void main(String[] args) {
		String opc;
		Scanner entrada = new Scanner(System.in);
		String cadena = " Menu de Opciones \n";
		cadena = cadena + " 1.-Opcion 1 \n";
		cadena = cadena + " 2.-Opcion 2 \n";
		cadena = cadena + " 3.-Opcion 3 \n";
		cadena = cadena + " 4.-Opcion 4 \n";
		cadena = cadena + " Eliga una opcion [1..4] --> ";

		System.out.print(cadena);
		opc = entrada.next();

		cadena = "";
		switch (opc) {
		case "1": cadena = "Elegiste la opcion 1"; break;
		case "2": cadena = "Elegiste la opcion 2"; break;
		case "3": cadena = "Elegiste la opcion 3"; break;
		case "4": cadena = "Elegiste la opcion 4"; break;
		default: cadena = "Elegiste una opcion que no existe"; break;
		}
		System.out.println("\n" + cadena);
		entrada.close();
	}
}
