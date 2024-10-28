import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pila<T> {
    // Internamente usamos un ArrayList para almacenar los elementos de la pila
    private ArrayList<T> elementos;

    // Constructor que inicializa la pila
    public Pila() {
        this.elementos = new ArrayList<>();
    }

    // Método para añadir un elemento a la pila (push)
    public void push(T elemento) {
        elementos.add(elemento);
        System.out.println("Elemento " + elemento + " añadido a la pila.");
    }

    // Método para quitar y devolver el elemento superior de la pila (pop)
    public T pop() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        // Eliminamos y devolvemos el último elemento
        T elemento = elementos.remove(elementos.size() - 1);
        System.out.println("Elemento " + elemento + " sacado de la pila.");
        return elemento;
    }

    // Método para obtener el elemento superior de la pila sin quitarlo (peek)
    public T peek() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        // Devolvemos el último elemento sin quitarlo
        return elementos.get(elementos.size() - 1);
    }

    // Método para comprobar si la pila está vacía
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    // Método para obtener el tamaño de la pila
    public int tamaño() {
        return elementos.size();
    }

    public static void main(String[] args) {
        // Crear una pila para Integer
        Pila<Integer> pilaEnteros = new Pila<>();

        // Añadir elementos a la pila
        pilaEnteros.push(10);
        pilaEnteros.push(20);
        pilaEnteros.push(30);

        // Obtener el elemento superior (peek)
        System.out.println("Elemento superior (peek): " + pilaEnteros.peek());

        // Sacar el elemento superior (pop)
        pilaEnteros.pop();

        // Comprobar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pilaEnteros.estaVacia());

        // Sacar más elementos
        pilaEnteros.pop();
        pilaEnteros.pop();

        // Intentar hacer pop en una pila vacía (generará excepción)
        try {
            pilaEnteros.pop();
        } catch (EmptyStackException e) {
            System.out.println("Error: La pila está vacía.");
        }
    }
}
