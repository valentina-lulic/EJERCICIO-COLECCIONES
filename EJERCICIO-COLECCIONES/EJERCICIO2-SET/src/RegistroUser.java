import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistroUser {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Paso 1: Crear el HashSet para almacenar nombres de user:
        Set<String> usuarios = new HashSet<>();

        // Paso 2: Preguntar cuántos user se van a registrar:
        System.out.print("¿Cuántos usuarios deseas registrar?: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine(); // sacamos salto de línea

        // Paso 3 y 4: Solicitar nombre de cada user:
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre del usuario " + (i + 1) + ": ");
            String nombre = teclado.nextLine();

            // Paso 5: El truco! Si usuarios.add(nombre) devuelve false, significa que ya existía
            if (!usuarios.add(nombre)) {
                System.out.println("-> Usuario repetido");
                // Como estaba repetido y no se agregó, este ciclo no cuenta para el total real
            }
        }

        System.out.println("\n--- Registro Completado ---");

        // Paso 6: Mostrar todos los usuarios únicos registrados
        System.out.println("Usuarios únicos en el sistema:");
        for (String user : usuarios) {
            System.out.println("- " + user); // solo estetica
        }

        // Paso 7: Mostrar cuántos usuarios únicos existen
        System.out.println("\nCantidad total de users: " + usuarios.size());

        teclado.close(); //buena practica
    }
}
