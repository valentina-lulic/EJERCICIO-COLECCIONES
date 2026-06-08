import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        // Para poder leer lo que el usuario escribe en el teclado
        Scanner teclado = new Scanner(System.in);

        // Paso 1: Crear una lista de productos:
        List<String> productos = new ArrayList<>();

        // Paso 2: para interactuar con el user
        System.out.print("Hola, Bienvenido a Novus Market, ¿Cuántos productos vas a comprar?");
        int cantidad = teclado.nextInt();

        // otra forma de arreglar lo del salto de línea:
        teclado.nextLine();

        // Paso 3: Solicitar cada producto usando ciclo 'for':
        for (int i = 0; i < cantidad; i++) { //formula infalible
            System.out.print("Ingresa el nombre de tu producto " + (i + 1) + ": ");
            String producto = teclado.nextLine();

            // Agregamos el producto a nuestra lista
            productos.add(producto);
        }

        System.out.println("\n--- Ya tenemos tu compra ---");
        // Paso 4: Mostrar todos los productos registrados (recorrer la lista)
        System.out.println("Productos en la lista:");
        for (String prod : productos) {
            System.out.println("- " + prod); //Ponerle un guion a la lista para q se vea bonito :3 acá estamos concatenando con el +
        }

        // Paso 5: Mostrar cuántos productos fueron ingresados con .size()
        System.out.println("\nCantidad total de productos ingresados: " + productos.size());

        // buena práctica:
        teclado.close();
    }
}