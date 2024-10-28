

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio1<T> {
    private static final int ELEMENTS = 100000; // Número de elementos para la prueba

    public static void main(String[] args) {
        // Crear instancia de la clase con Integer como tipo genérico
        Ejercicio1<Integer> test = new Ejercicio1<>();

        // Ejecutar las pruebas con tipo Integer
        test.runTests(new ArrayList<>(), new LinkedList<>());
    }

    // Método que ejecuta las pruebas para dos listas
    public void runTests(List<T> arrayList, List<T> linkedList) {
        // Insertar elementos genéricos (por ejemplo, Integer)
        long arrayListInsertTime = insertElements(arrayList, ELEMENTS);
        long linkedListInsertTime = insertElements(linkedList, ELEMENTS);

        // Acceder a elementos genéricos
        long arrayListAccessTime = accessElements(arrayList, ELEMENTS);
        long linkedListAccessTime = accessElements(linkedList, ELEMENTS);

        // Eliminar elementos genéricos
        long arrayListRemoveTime = removeElements(arrayList, ELEMENTS);
        long linkedListRemoveTime = removeElements(linkedList, ELEMENTS);

        // Imprimir resultados
        System.out.println("ArrayList - Tiempo de inserción: " + arrayListInsertTime + " ns");
        System.out.println("LinkedList - Tiempo de inserción: " + linkedListInsertTime + " ns");
        System.out.println("ArrayList - Tiempo de acceso: " + arrayListAccessTime + " ns");
        System.out.println("LinkedList - Tiempo de acceso: " + linkedListAccessTime + " ns");
        System.out.println("ArrayList - Tiempo de eliminación: " + arrayListRemoveTime + " ns");
        System.out.println("LinkedList - Tiempo de eliminación: " + linkedListRemoveTime + " ns");
    }

    // Método para insertar elementos genéricos en una lista
    private long insertElements(List<T> list, int numberOfElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add((T) Integer.valueOf(i)); // En este caso, usamos Integer
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Método para acceder a elementos genéricos en una lista
    private long accessElements(List<T> list, int numberOfElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Método para eliminar elementos genéricos de una lista
    private long removeElements(List<T> list, int numberOfElements) {
        long startTime = System.nanoTime();
        for (int i = numberOfElements - 1; i >= 0; i--) {
            list.remove(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
