package a2223213042_practica06;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {


        int a1, a2, d1, d2, m1, m2, dias;
        try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Fecha 1: Introduzca día: ");
			d1 = entrada.nextInt();

			System.out.print("Fecha 1: Introduzca mes: ");
			m1 = entrada.nextInt();

			System.out.print("Fecha 1: Introduzca año: ");
			a1 = entrada.nextInt();

			System.out.print("Fecha 2: Introduzca día: ");
			d2 = entrada.nextInt();

			System.out.print("Fecha 2: Introduzca mes: ");
			m2 = entrada.nextInt();

			System.out.print("Fecha 2: Introduzca año: ");
			a2 = entrada.nextInt();
		}

        dias = d2 - d1 + 30 * (m2 - m1) + 365 * (a2 - a1);

        System.out.println("Días de diferencia: " + dias);
    }
}