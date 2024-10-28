public class Caja<T> {
    // Variable para almacenar el contenido de la caja
    private T contenido;

    // Método para poner un objeto en la caja
    public void poner(T contenido) {
        this.contenido = contenido;
        System.out.println("Contenido puesto en la caja: " + contenido);
    }

    // Método para sacar el objeto de la caja
    public T sacar() {
        T temp = contenido;
        contenido = null; // Vaciamos la caja
        System.out.println("Contenido sacado de la caja: " + temp);
        return temp;
    }

    // Método para verificar si la caja está vacía
    public boolean estaVacia() {
        return contenido == null;
    }

    public static void main(String[] args) {
        // Crear una caja para almacenar Integer
        Caja<Integer> cajaEnteros = new Caja<>();

        // Poner un número en la caja
        cajaEnteros.poner(100);

        // Sacar el número de la caja
        cajaEnteros.sacar();

        // Verificar si la caja está vacía
        System.out.println("¿La caja está vacía? " + cajaEnteros.estaVacia());

        // Crear una caja para almacenar String
        Caja<String> cajaStrings = new Caja<>();

        // Poner un texto en la caja
        cajaStrings.poner("Hola Mundo");

        // Sacar el texto de la caja
        cajaStrings.sacar();

        // Verificar si la caja está vacía
        System.out.println("¿La caja está vacía? " + cajaStrings.estaVacia());
    }
}
