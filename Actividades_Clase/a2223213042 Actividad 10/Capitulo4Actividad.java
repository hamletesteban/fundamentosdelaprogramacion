import java.io.IOException;

/**
 * Proyecto: amatricula_estudiodecaso
 * Actividad 4.8.5 - Gestor genérico de menús (principio DRY)
 *
 * GestionarMenu recibe el título, un arreglo de opciones y un arreglo paralelo de
 * acciones (expresiones lambda). La última opción de cada menú es siempre "Salida".
 * Reutiliza las funciones de apoyo de la clase Capitulo4.
 */
public class Capitulo4Actividad {

    // Interfaz funcional: como Runnable, pero permite lanzar IOException
    @FunctionalInterface
    interface Accion {
        void ejecutar() throws IOException;
    }

    // Gestor genérico: contiene el único do-while de menús del proyecto
    public static void GestionarMenu(String titulo, String[] opciones, Accion[] acciones) throws IOException {
        int posicionSalida = opciones.length;
        String opcion;
        do {
            opcion = Capitulo4.DesplegarMenu(titulo, opciones);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else if (!Capitulo4.EsNumeroEntero(opcion)
                    || Integer.parseInt(opcion) < 1
                    || Integer.parseInt(opcion) > posicionSalida) {
                System.out.println("No existe esta opcion ");
            } else {
                int indice = Integer.parseInt(opcion) - 1;
                if (indice == posicionSalida - 1) {
                    System.out.println("Salida del Sistema ");
                } else {
                    acciones[indice].ejecutar();
                }
            }
        } while (opcion == null || !opcion.equals(String.valueOf(posicionSalida)));
    }

    // MenuPrincipal reescrito con GestionarMenu
    public static void MenuPrincipal() throws IOException {
        String[] opciones = {"1.-Productos ", "2.-Punto de Venta ", "3.-Inventario ", "4.-Ventas ", "5.-Salida "};
        Accion[] acciones = {
            () -> MenuProductos(),
            () -> Capitulo4.MenuPuntoVenta("000"),
            () -> MenuInventario(),
            () -> System.out.println("Ventas "),
            null // la salida la maneja GestionarMenu
        };
        GestionarMenu("Menu de Punto Tienda de Abarrotes La Pequeña", opciones, acciones);
    }

    // MenuProductos reescrito con GestionarMenu
    public static void MenuProductos() throws IOException {
        String[] opciones = {"1.-Modificar ", "2.-Listado ", "3.-Salida "};
        Accion[] acciones = {
            () -> System.out.println("Modificar Precio Producto "),
            () -> System.out.println("Listado Producto "),
            null
        };
        GestionarMenu("Opciones de Productos", opciones, acciones);
    }

    // MenuInventario reescrito con GestionarMenu
    public static void MenuInventario() throws IOException {
        String[] opciones = {"1.-Listado ", "2.-Agregar ", "3.-Salida "};
        Accion[] acciones = {
            () -> System.out.println("Listado de Inventario "),
            () -> System.out.println("Agregar Inventario "),
            null
        };
        GestionarMenu("Opciones de Inventarios", opciones, acciones);
    }

    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }
}
