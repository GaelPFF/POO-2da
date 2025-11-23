package PolimorfismoSimple;

import Interfaces.Operaciones;
import java.util.ArrayList;

public class ArrayDinamico implements Operaciones {
    private ArrayList<String> lista;
    
    public ArrayDinamico(){
        lista = new ArrayList<String>();
    }
    
    
    @Override
    public boolean arrayVacio() {
        return lista.isEmpty();
    }

    @Override
    public void agregar(String valor) {
        lista.add(valor); 
    }

    @Override
    public String obtenerDato(byte indice) {
        return lista.get(indice); 
    }

    @Override
    public void eliminar(byte indice) {
        lista.remove(indice);
    }

    @Override
    public byte tamaño() {
        return (byte) lista.size();
    }

    @Override
    public void limpiar() {
        lista.clear();
    }

    @Override
    public String mostrar() {
        return lista.toString();
    }
    
}
