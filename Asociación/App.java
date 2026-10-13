public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Instanciar (crear) los objetos de tipo Libro
        Libro l1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro l2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        // 2. Instanciar (crear) los objetos de tipo Lector
        Lector lector1 = new Lector("10203040", "Carlos");
        Lector lector2 = new Lector("90807060", "Ana");

        // 3. Probar los métodos y la interacción entre clases
        System.out.println("--- ESTADO INICIAL ---");
        l1.mostrarInfo();
        lector1.muestraEstado();

        System.out.println("\n--- CARLOS PIDE UN LIBRO ---");
        lector1.tomarPrestado(l1);
        lector1.muestraEstado();

        System.out.println("\n--- ANA INTENTA PEDIR EL MISMO LIBRO ---");
        // Debería indicar que ya está prestado
        lector2.tomarPrestado(l1); 

        System.out.println("\n--- CARLOS INTENTA PEDIR OTRO LIBRO ---");
        // Debería indicar que ya tiene un libro y debe devolverlo
        lector1.tomarPrestado(l2); 

        System.out.println("\n--- CARLOS DEVUELVE EL LIBRO ---");
        lector1.regresarLibro();
        lector1.muestraEstado();

        System.out.println("\n--- ANA AHORA SÍ PIDE EL LIBRO ---");
        lector2.tomarPrestado(l1);
        lector2.muestraEstado();
    }
}