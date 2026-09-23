import javax.swing.JOptionPane;

public class ejercicio05_c {
	public static void main(String[] args) {
		String producto1, producto2;
		double precio1, precio2, iva1, iva2, subtotal1, subtotal2, total1, total2;
		int opc, cant1, cant2;

		producto1 = "coca cola light lata 400 mil";
		producto2 = "coca cola lata 400 mil";
		precio1 = 16;
		precio2 = 15;

		String menu = "Menu de Opciones\n1.- Productos\n2.- Punto de venta\nQue opcion deseas:";
		opc = Integer.parseInt(JOptionPane.showInputDialog(menu));

		switch (opc) {
		case 1:
			JOptionPane.showMessageDialog(null,
					"elegiste la opcion de productos"
					+ "\nel " + producto1 + " cuesta " + precio1
					+ "\nel " + producto2 + " cuesta " + precio2);
			break;
		case 2:
			cant1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada de " + producto1));
			cant2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada de " + producto2));

			subtotal1 = (cant1 * precio1);
			iva1 = subtotal1 * 0.16;
			total1 = iva1 + subtotal1;

			subtotal2 = (cant2 * precio2);
			iva2 = subtotal2 * 0.16;
			total2 = iva2 + subtotal2;

			String resumen = cant1 + " " + producto1
					+ "\nsubtotal fue " + subtotal1 + " iva fue " + iva1 + " total fue " + total1
					+ "\n\n" + cant2 + " " + producto2
					+ "\nsubtotal fue " + subtotal2 + " iva fue " + iva2 + " total fue " + total2
					+ "\n\nel total de la venta fue:"
					+ "\nsubtotal fue " + (subtotal1 + subtotal2)
					+ "\nel total de iva fue " + (iva1 + iva2)
					+ "\nTotal fue " + (total1 + total2);

			JOptionPane.showMessageDialog(null, resumen);
			break;
		default:
			JOptionPane.showMessageDialog(null, "eleccion incorrecta");
		}
	}
}
