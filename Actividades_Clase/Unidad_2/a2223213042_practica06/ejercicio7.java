package a2223213042_practica06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio7 {

    public static void main(String[] args) throws IOException {

        int d1, m1, a1, d2, m2, a2, dias;
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Fecha 1: Introduzca día: ");
        d1 = Integer.parseInt(entrada.readLine());

        System.out.print("Fecha 1: Introduzca mes: ");
        m1 = Integer.parseInt(entrada.readLine());

        System.out.print("Fecha 1: Introduzca año: ");
        a1 = Integer.parseInt(entrada.readLine());

        System.out.print("Fecha 2: Introduzca día: ");
        d2 = Integer.parseInt(entrada.readLine());

        System.out.print("Fecha 2: Introduzca mes: ");
        m2 = Integer.parseInt(entrada.readLine());

        System.out.print("Fecha 2: Introduzca año: ");
        a2 = Integer.parseInt(entrada.readLine());

     
        dias = d2 - d1 + 30 * (m2 - m1) + 365 * (a2 - a1);

        System.out.println("Días de diferencia: " + dias);
    }
}