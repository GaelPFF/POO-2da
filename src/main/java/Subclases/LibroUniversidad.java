package Subclases;

import TDAHija.LibroTexto;
import EntradaSalida.JOpane;

public class LibroUniversidad extends LibroTexto {
    private String universidad;

    public LibroUniversidad() {
        super();
    }

    public LibroUniversidad(String titulo, String autor, float precio, String asignatura, String universidad) {
        super(titulo, autor, precio, asignatura);
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Override
    public void mostrarInfo() {
        JOpane.imprimeSalida("Título: " + getTitulo() +
                       "\nAutor: " + getAutor() +
                       "\nPrecio: $" + getPrecio() +
                       "\nAsignatura: " + getAsignatura() +
                       "\nUniversidad: " + universidad,"Libro");
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidad: " + universidad;
    }
}
