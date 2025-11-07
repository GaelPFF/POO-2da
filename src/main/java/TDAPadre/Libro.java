package TDAPadre;

import EntradaSalida.JOpane;

public class Libro {
    protected String titulo;
    protected String autor;
    protected float precio;

    public Libro() {
    }

    public Libro(String titulo, String Autor, float precio) {
        this.titulo = titulo;
        this.autor = Autor;
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void mostrarLibro(){
        JOpane.imprimeSalida("Titulo:"+ titulo + "\nAutor:"+ autor + "\nPrecio:"+ precio +"pesos", autor);
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + '}';
    }
    
    
}
