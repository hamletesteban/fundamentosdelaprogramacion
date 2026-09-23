import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio03 {

	public static void main(String[] args) throws IOException {
		String opc;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String cadena = " Menu de Opciones \n";
		cadena = cadena + " 1.-Opcion 1 \n";
		cadena = cadena + " 2.-Opcion 2 \n";
		cadena = cadena + " 3.-Opcion 3 \n";
		cadena = cadena + " 4.-Opcion 4 \n";
		cadena = cadena + " Eliga una opcion [1..4] --> ";

		System.out.print(cadena);
		opc = entrada.readLine();

		cadena = "";
		switch (opc) {
		case "1": cadena = "Elegiste la opcion 1"; break;
		case "2": cadena = "Elegiste la opcion 2"; break;
		case "3": cadena = "Elegiste la opcion 3"; break;
		case "4": cadena = "Elegiste la opcion 4"; break;
		default: cadena = "Elegiste una opcion que no existe"; break;
		}
		System.out.println("\n" + cadena);
	}
}
