import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Proyecto: amatricula_estudiodecaso
 * Capítulo 4 - Diseño de la estructura del proyecto principal
 * Integra las funciones de apoyo del capítulo 3 y agrega los menús del sistema.
 */
public class Capitulo4 {

    // ------------------------------------------------------------------
    // Declaración de variables globales
    // ------------------------------------------------------------------
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    // ------------------------------------------------------------------
    // Declaración de funciones (capítulo 3)
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

    // 3.4.1 Función diálogo (usa el lector global; si la entrada termina, cierra el programa)
    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.println(texto + " : ");
        cadena = lectura.readLine();
        if (cadena == null) {
            System.out.println("Entrada finalizada. Hasta luego.");
            System.exit(0);
        }
        return cadena;
    }

    // 3.4.2 Función desplegar menú
    public static String DesplegarMenu(String Titulo1, String[] menu) throws IOException {
        String cadena;
        cadena = Titulo1 + "\n" + "\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\n Que opcion deseas ";
        return cadena = Leer(cadena);
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

    // ------------------------------------------------------------------
    // Declaración de procedimientos (capítulo 4)
    // ------------------------------------------------------------------

    // 4.1 / 4.5 Procedimiento menú principal (versión actualizada: llama a los submenús)
    public static void MenuPrincipal() throws IOException {
        String[] datosmenuprincipal = {"1.-Productos ", "2.-Punto de Venta ", "3.-Inventario ", "4.-Ventas ", "5.-Salida "};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Menu de Punto Tienda de Abarrotes La Pequeña", datosmenuprincipal);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1": MenuProductos(); break;
                    case "2": MenuPuntoVenta("000"); break;
                    case "3": MenuInventario(); break;
                    case "4": System.out.println("Ventas "); break;
                    case "5": System.out.println("Salida del Sistema "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
            }
        } while (opcion == null || opcion.compareTo("5") != 0);
    }

    // 4.2 Procedimiento menú productos
    public static void MenuProductos() throws IOException {
        String[] datosmenuproductos = {"1.-Modificar ", "2.-Listado ", "3.-Salida "};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1": System.out.println("Modificar Precio Producto "); break;
                    case "2": System.out.println("Listado Producto "); break;
                    case "3": System.out.println("Salida del Sistema "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
            }
        } while (opcion == null || opcion.compareTo("3") != 0);
    }

    // 4.3 Procedimiento menú punto de venta
    public static void MenuPuntoVenta(String idticket) throws IOException {
        String opcion, membrete;
        boolean pago = false;
        idticket = IdTicketSiguiente(idticket);
        String fechadia = Fecha();
        membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket;
        membrete = membrete + "\n-----------------------------------------------------\n";
        String[] datosmenu = {"1.-Agregar ", "2.-Eliminar ", "3.-Listado ", "4.-Pagar ", "5.-Salida "};
        do {
            opcion = DesplegarMenu(membrete + "\n Menu de Punto de Venta", datosmenu);
            if (opcion == null) {
                System.out.println("dato incorrecto introducido");
            } else {
                switch (opcion) {
                    case "1": System.out.println("Agregar Articulo al Ticket "); break;
                    case "2": System.out.println("Eliminar Articulo del Ticket "); break;
                    case "3": System.out.println("Listado de Articulos del Ticket "); break;
                    case "4":
                        System.out.println("Pagar Ticket y salir");
                        opcion = "5";
                        pago = true;
                        break;
                    case "5":
                        System.out.println("Salida del Ventas ");
                        if (!pago) {
                            System.out.println("No pago el ticket ");
                            System.out.println("eliminando ticket " + idticket);
                        }
                        break;
                    default: System.out.println("No existe esta opcion"); break;
                }
            }
        } while (opcion == null || opcion.compareTo("5") != 0);
    }

    // 4.4 Procedimiento menú inventarios
    public static void MenuInventario() throws IOException {
        String[] datosmenuinventario = {"1.-Listado ", "2.-Agregar ", "3.-Salida "};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1": System.out.println("Listado de Inventario "); break;
                    case "2": System.out.println("Agregar Inventario "); break;
                    case "3": System.out.println("Salida del Sistema "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
            }
        } while (opcion == null || opcion.compareTo("3") != 0);
    }

    // ------------------------------------------------------------------
    // 4.6 Función main del proyecto
    // ------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }
}
