import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaTelefonica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Paso 1: Crear el HashMap (Clave: Nombre, Valor: Teléfono)
        Map<String, String> agenda = new HashMap<>();

        // Paso 2 y 3: Registrar exactamente 5 contactos:
        System.out.println("||| Registro de 5 Contactos |||");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nContacto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Teléfono: ");
            String telefono = teclado.nextLine();

            // Guardamos la pareja en el mapa usando .put()
            agenda.put(nombre, telefono);
        }

        System.out.println("\n--- Paso 4: Lista de Contactos Registrados ---");
        // Recorremos el mapa usando entrySet():
        for (var contacto : agenda.entrySet()) {
            // .getKey() nos da el Nombre, .getValue() nos da el Teléfono
            System.out.println("Nombre: " + contacto.getKey() + " | Teléfono: " + contacto.getValue());
        }

        System.out.println("\n--- Buscar un Teléfono ---");
        // Paso 5: Solicitar un nombre para buscar
        System.out.print("Ingresa el nombre del contacto que deseas buscar: ");
        String nombreBuscar = teclado.nextLine();

        // Paso 6: Mostrar el teléfono asociado usando .get()
        // .get(nombre) busca la clave y nos devuelve su valor (el teléfono)
        String telefonoEncontrado = agenda.get(nombreBuscar);

        // Validamos si el contacto realmente existía en la agenda
        if (telefonoEncontrado != null) {
            System.out.println("El teléfono de " + nombreBuscar + " es: " + telefonoEncontrado);
        } else {
            System.out.println("Lo siento, " + nombreBuscar + " no está en la agenda.");
        }

        teclado.close();
    }
}
