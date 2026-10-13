public class Asiento {
    private String codigo;
    private boolean ocupado;

    public Asiento(String codigo) {
        this.codigo = codigo;
        this.ocupado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void ocupar() {
        if(ocupado){
            System.out.println("El asiento " + codigo + " ya está ocupado.");
        } else {
            ocupado = true;
            System.out.println("Asiento " + codigo + " ocupado.");
        }
    }

    public void liberar() {
        ocupado = false;
        System.out.println("Asiento " + codigo + " liberado.");
    }

    public void mostrarEstado() {
        System.out.println("Asiento " + codigo + ": " + (ocupado ? "ocupado" : "Libre"));
    }
}