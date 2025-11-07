package TDAHija;

import TDAPadre.Libro;
import EntradaSalida.JOpane;

public class LibroTexto extends Libro {
    private String asignatura;

    // Constructor vacío
    public LibroTexto() {
        super();
    }

    // Constructor parametrizado
    public LibroTexto(String titulo, String autor, float precio, String asignatura) {
        super(titulo, autor, precio);
        this.asignatura = asignatura;
    }


    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarInfo() {
        JOpane.mostrar("Título: " + getTitulo() +
