
import java.util.HashSet;
import java.util.Set;

public class MiConjunto<T> {
    // Internamente utilizamos un HashSet para almacenar los elementos
    private Set<T> conjunto;

    // Constructor que inicializa el HashSet
    public MiConjunto() {
        this.conjunto = new HashSet<>();
    }

    // Método para añadir un elemento al conjunto
    public void añadir(T elemento) {
        if (conjunto.add(elemento)) {
            System.out.println(elemento + " añadido al conjunto.");
        } else {
            System.out.println(elemento + " ya existe en el conjunto.");
        }
    }

    // Método para eliminar un elemento del conjunto
    public void eliminar(T elemento) {
        if (conjunto.remove(elemento)) {
            System.out.println(elemento + " eliminado del conjunto.");
        } else {
            System.out.println(elemento + " no existe en el conjunto.");
        }
    }

    // Método para comprobar si un elemento está en el conjunto
    public boolean contiene(T elemento) {
        return conjunto.contains(elemento);
    }

    // Método para mostrar todos los elementos del conjunto
    public void mostrarElementos() {
        System.out.println("Elementos en el conjunto: " + conjunto);
    }

    // Método para obtener el tamaño del conjunto
    public int tamaño() {
        return conjunto.size();
    }

    // Método para limpiar el conjunto
    public void limpiar() {
        conjunto.clear();
        System.out.println("El conjunto ha sido limpiado.");
    }

    public static void main(String[] args) {
        // Crear una instancia de MiConjunto con tipo Integer
        MiConjunto<Integer> conjuntoEnteros = new MiConjunto<>();

        // Añadir elementos
        conjuntoEnteros.añadir(10);
        conjuntoEnteros.añadir(20);
        conjuntoEnteros.añadir(30);
        conjuntoEnteros.añadir(20); // Añadir elemento duplicado

        // Mostrar elementos
        conjuntoEnteros.mostrarElementos();

        // Comprobar si un elemento existe
        System.out.println("¿El conjunto contiene 20? " + conjuntoEnteros.contiene(20));
        System.out.println("¿El conjunto contiene 40? " + conjuntoEnteros.contiene(40));

        // Eliminar un elemento
        conjuntoEnteros.eliminar(20);
        conjuntoEnteros.mostrarElementos();

        // Obtener el tamaño del conjunto
        System.out.println("Tamaño del conjunto: " + conjuntoEnteros.tamaño());

        // Limpiar el conjunto
        conjuntoEnteros.limpiar();
        conjuntoEnteros.mostrarElementos();
    }
}


