package a2223213042_practica06;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {

        String salida = "";

        double precio, subtotal, iva, total;
        double sumaIva = 0, sumaTotal = 0;

        int cant;
        int sumaCant = 0;

        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Introduzca el precio del refresco cola light lata: ");
        precio = entrada.nextDouble();

        System.out.print("Introduzca la cantidad comprada del refresco cola light lata: ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = subtotal * 0.16;
        total = subtotal + iva;

        salida = "Subtotal: " + subtotal +
                " IVA: " + iva +
                " Total: " + total;

        System.out.println(salida);

        sumaCant += cant;
        sumaIva += iva;
        sumaTotal += total;

        // Arroz
        System.out.print("\nIntroduzca el precio 1/4 de Arroz: ");
        precio = entrada.nextDouble();

        System.out.print("Introduzca la cantidad comprada del 1/4 de Arroz: ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = subtotal * 0.16;
        total = subtotal + iva;

        salida = "Subtotal: " + subtotal +
                " IVA: " + iva +
                " Total: " + total;

        System.out.println(salida);

        sumaCant += cant;
        sumaIva += iva;
        sumaTotal += total;

       
        System.out.print("\nIntroduzca el precio pieza de pan francés: ");
        precio = entrada.nextDouble();

        System.out.print("Introduzca la cantidad comprada piezas de pan francés: ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = subtotal * 0.16;
        total = subtotal + iva;

        salida = "Subtotal: " + subtotal +
                " IVA: " + iva +
                " Total: " + total;

        System.out.println(salida);

        sumaCant += cant;
        sumaIva += iva;
        sumaTotal += total;

       
        System.out.println("\nEl total de productos vendidos fue: " + sumaCant);
        System.out.println("El total del IVA fue: " + sumaIva);
        System.out.println("El total fue: " + sumaTotal);
    }
}