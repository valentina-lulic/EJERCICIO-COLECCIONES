import java.util.ArrayList;
import java.util.List;

public class FiltroNotas {
    public static void main(String[] args) {
        // Paso 1 y 2: Crear el ArrayList y agregar varias notas (usamos Double para decimales)
        List<Double> notas = new ArrayList<>();
        notas.add(5.5);
        notas.add(3.2);
        notas.add(6.8);
        notas.add(4.0);
        notas.add(2.5);
        notas.add(7.0);
        notas.add(3.9);

        System.out.println("Todas las notas ingresadas: " + notas);
        System.out.println("\n--- Procesando con Streams ---");

        // Paso 3: Utilizar Stream para filtrar y mostrar únicamente las notas aprobadas (>= 4.0)
        System.out.println("Notas aprobadas:");
        notas.stream()
                .filter(nota -> nota >= 4.0) // Deja pasar solo las aprobadas, osea de 4 para arriba
                .forEach(nota -> System.out.println("- " + nota)); // Muestra cada una en pantalla

        // Paso 4: Contar cuántas notas aprobadas existen
        // Ojo: .count() devuelve un tipo de número largo llamado 'long'
        long cantidadAprobados = notas.stream()
                .filter(nota -> nota >= 4.0) // esto es literal: "para cada nota, deja pasar solo la nota mayor o igual a 4.0.
                .count(); // es un contador

        System.out.println("\nCantidad total de notas aprobadas: " + cantidadAprobados);
    }
}