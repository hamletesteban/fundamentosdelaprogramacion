package a2223213042_practica06;

import javax.swing.JOptionPane;

public class ejercicio6 {

    public static void main(String[] args) {

        int numero;
        int dm, um, c, d, u;
        String salida;

   
        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Introduzca un número entre 0 y 99.999: "));

        dm = (int) numero / 10000;
        numero = numero % 10000;

        um = (int) numero / 1000;
        numero = numero % 1000;

        c = (int) numero / 100;
        numero = numero % 100;

        d = (int) numero / 10;
        numero = numero % 10;

        u = numero;


        salida = u + " " + d + " " + c + " " + um + " " + dm;

        numero = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        salida = salida + "\n" + numero;

        System.out.println(salida);
        JOptionPane.showMessageDialog(null, salida);
    }
}
