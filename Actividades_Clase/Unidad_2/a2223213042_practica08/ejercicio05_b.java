import java.util.Scanner;

public class ejercicio05_b {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String producto1, producto2;
		double precio1, precio2, iva1, iva2, subtotal1, subtotal2, total1, total2;
		int opc, cant1, cant2;

		producto1 = "coca cola light lata 400 mil";
		producto2 = "coca cola lata 400 mil";
		precio1 = 16;
		precio2 = 15;

		System.out.println("Menu de Opciones");
		System.out.println("1.- Productos");
		System.out.println("2.- Punto de venta");
		System.out.print("Que opcion deseas: ");
		opc = entrada.nextInt();

		switch (opc) {
		case 1:
			System.out.println("elegiste la opcion de productos");
			System.out.println("el " + producto1 + " cuesta " + precio1);
			System.out.println("el " + producto2 + " cuesta " + precio2);
			break;
		case 2:
			System.out.println("Introduzca la cantidad comprada de " + producto1);
			cant1 = entrada.nextInt();
			System.out.println("Introduzca la cantidad comprada de " + producto2);
			cant2 = entrada.nextInt();

			subtotal1 = (cant1 * precio1);
			iva1 = subtotal1 * 0.16;
			total1 = iva1 + subtotal1;
			System.out.println(cant1 + " " + producto1);
			System.out.println("subtotal fue " + subtotal1 + " iva fue " + iva1 + " total fue " + total1);

			subtotal2 = (cant2 * precio2);
			iva2 = subtotal2 * 0.16;
			total2 = iva2 + subtotal2;
			System.out.println(cant2 + " " + producto2);
			System.out.println("subtotal fue " + subtotal2 + " iva fue " + iva2 + " total fue " + total2);

			System.out.println("el total de la venta fue:");
			System.out.println("subtotal fue " + (subtotal1 + subtotal2));
			System.out.println("el total de iva fue " + (iva1 + iva2));
			System.out.println("Total fue " + (total1 + total2));
			break;
		default:
			System.out.println("eleccion incorrecta");
		}
		entrada.close();
	}
}
