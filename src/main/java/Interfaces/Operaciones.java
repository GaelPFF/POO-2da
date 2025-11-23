package Interfaces;

public interface Operaciones {
    boolean arrayVacio();
    void agregar(String valor);
    String obtenerDato(byte indice);
    void eliminar(byte indice);
    byte tamaño();
    void limpiar();
    String mostrar();
}
