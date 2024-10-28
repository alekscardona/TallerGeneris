import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejecicio3 {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar la frecuencia de las palabras
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        // Leer el texto de entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();

        // Convertir el texto en minúsculas y eliminar puntuaciones básicas
        texto = texto.toLowerCase().replaceAll("[^a-záéíóúüñ0-9\\s]", "");

        // Separar las palabras utilizando espacios
        String[] palabras = texto.split("\\s+");

        // Contar la frecuencia de cada palabra
        for (String palabra : palabras) {
            if (frecuenciaPalabras.containsKey(palabra)) {
                // Si la palabra ya existe, incrementar su contador
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.get(palabra) + 1);
            } else {
                // Si es la primera vez que aparece, añadirla con frecuencia 1
                frecuenciaPalabras.put(palabra, 1);
            }
        }

        // Imprimir las palabras y sus frecuencias
        System.out.println("\nFrecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
