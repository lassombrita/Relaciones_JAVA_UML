public class Lector {
    private String nombre;
    private String cedula;
    private Libro libroActual;

    public Lector() {
    }

    public Lector(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Libro getLibroActual() {
        return libroActual;
    }

    // setters
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLibroActual(Libro libroActual) { 
        this.libroActual = libroActual;
    }

    // métodos
    public void tomarPrestado(Libro libro) {
        if (libroActual != null) {
            System.out.println(this.nombre + " ya tiene el libro \"" + this.libroActual.getTitulo() + "\". Debe devolverlo primero.");
        } else {
            if (libro.prestar()) {
                libroActual = libro; 
            }
        }
    }

    public void regresarLibro() {
        if (libroActual == null) {
            System.out.println(this.nombre + " no tiene ningún libro.");
        } else {
            libroActual.devolver();
            libroActual = null;
        }
    }

    public void muestraEstado() {
        String estado = (libroActual != null) ? libroActual.getTitulo() : "Sin libro";
        System.out.println("Lector: " + this.nombre + " | Libro: " + estado);
    }
}