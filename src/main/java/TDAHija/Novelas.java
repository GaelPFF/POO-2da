package TDAHija;

import TDAPadre.Libro;
import EntradaSalida.JOpane;

public class Novelas extends Libro {
    private String tipo;

    // Constructor vacío
    public Novelas() {
        super();
    }

    // Constructor parametrizado
    public Novelas(String titulo, String autor, float precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarInfo() {
        JOpane.imprimeSalida("Título: " + getTitulo() +
                       "\nAutor: " + getAutor() +
                       "\nPrecio: $" + getPrecio() +
                       "\nTipo de novela: " + tipo, "Libro");
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo;
    }
}
