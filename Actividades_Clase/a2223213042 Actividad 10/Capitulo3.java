import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Proyecto: amatricula_estudiodecaso
 * Capítulo 3 - Modularización del proyecto (Funciones de apoyo)
 * Libro: Pensamiento computacional en práctica (UAT / Fontamara, 2026)
 */
public class Capitulo3 {

    // Declaración de variables globales

    // ------------------------------------------------------------------
    // Declaración de funciones
    // ------------------------------------------------------------------

    // 3.3.1 Función mostrar menú (versión con while)
    public static String MostrarMenuWhile(String[] opciones) {
        String cadena = "";
        int i = 0;
        while (i < opciones.length) {
            cadena += (i + 1) + ". " + opciones[i] + "\n";
            i++;
        }
        return cadena;
    }

    // 3.3.1 Función mostrar menú (versión mejorada con for each)
    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        int i = 1;
        for (String info : opciones) {
            cadena = cadena + i + ". " + info + "\n";
            i++;
        }
        return cadena;
    }

    // 3.4.1 Función diálogo
    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.println(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        cadena = lectura.readLine();
        return cadena;
    }

    // 3.4.2 Función desplegar menú
    public static String DesplegarMenu(String Titulo1, String[] menu) throws IOException {
        String cadena;
        cadena = Titulo1 + "\n" + "\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\n Que opcion deseas ";
        return cadena = Dialogo(cadena);
    }

    // 3.5 Función leer
    public static String Leer(String texto) throws IOException {
        String cadena = "";
        cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty())
                cadena = null;
        } else
            cadena = null;
        return cadena;
    }

    // 3.5.1 Función evaluar numérico entero
    public static boolean EsNumeroEntero(String dato) {
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // 3.5.2 Función evaluar numérico double
    public static boolean EsNumeroDouble(String dato) {
        boolean valido = false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !valido) {
                    valido = true;
                } else {
                    return false;
                }
            }
        }
        return valido;
    }

    // 3.5.3 Función evaluar numérico
    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
        switch (tipo) {
            case 1:
                valido = EsNumeroEntero(dato);
                break;
            case 2:
                valido = EsNumeroDouble(dato);
                break;
        }
        return valido;
    }

    // 3.6.1 Función rellenar espacios (versión con ciclo for)
    public static String RellenarEspaciosConCiclo(String dato, int tamano) {
        String cadena;
        cadena = dato;
        for (int ciclo = dato.length(); ciclo < tamano; ciclo++) {
            cadena = cadena + " ";
        }
        return cadena;
    }

    // 3.6.1 Función rellenar espacios (versión con String.format)
    public static String RellenarEspacios(String dato, int tamano) {
        return String.format("%1$-" + tamano + "s", dato);
    }

    // 3.6.2 Función id ticket siguiente
    public static String IdTicketSiguiente(String idticket) {
        String idticketnext = "";
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10) {
            idticketnext = "00" + String.valueOf(num).trim();
        } else if ((num > 9) && (num < 100)) {
            idticketnext = "0" + String.valueOf(num).trim();
        } else {
            idticketnext = String.valueOf(num).trim();
        }
        return idticketnext;
    }

    // 3.6.3 Función obtener última posición
    public static int ObtenerUltimaPosicion(String[][] matriz) {
        int ultimaPosicion = -1;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] != null && !matriz[i][0].isEmpty()) {
                ultimaPosicion = i;
            }
        }
        return ultimaPosicion;
    }

    // 3.7 Función fecha
    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    // ------------------------------------------------------------------
    // Declaración de procedimientos
    // ------------------------------------------------------------------

    // Procedimiento de prueba para verificar las funciones de apoyo
    public static void ProbarFunciones() throws IOException {
        System.out.println("Fecha actual: " + Fecha());
        System.out.println("[" + RellenarEspacios("Hola", 10) + "]");
        System.out.println("Siguiente ticket de 089: " + IdTicketSiguiente("089"));
        System.out.println("Siguiente ticket de 000: " + IdTicketSiguiente("000"));

        String[][] tickets = {
            {"001", "Ana"},
            {"002", "Luis"},
            {"", ""},
            {null, null}
        };
        System.out.println("Ultima posicion ocupada: " + ObtenerUltimaPosicion(tickets));

        String entrada = Leer("Escribe un numero");
        if (entrada == null) {
            System.out.println("No escribiste nada.");
        } else if (EvaluarNumerico(entrada, 1)) {
            System.out.println(entrada + " es un entero valido.");
        } else if (EvaluarNumerico(entrada, 2)) {
            System.out.println(entrada + " es un decimal valido.");
        } else {
            System.out.println(entrada + " no es un numero valido.");
        }
    }

    // ------------------------------------------------------------------
    // Programa principal
    // ------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        String[] opciones = {"Probar funciones de apoyo", "Salir"};
        String opcionSeleccionada;
        do {
            opcionSeleccionada = DesplegarMenu("MENU PRINCIPAL - AMATRICULA", opciones);
            if (opcionSeleccionada == null) {
                // Fin de la entrada: se sale del programa para evitar un ciclo infinito
                System.out.println("Entrada finalizada. Hasta luego.");
                break;
            }
            switch (opcionSeleccionada.trim()) {
                case "1":
                    ProbarFunciones();
                    break;
                case "2":
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (!opcionSeleccionada.trim().equals("2"));
    }
}
