package Test;

import EntradaSalida.JOpane;
import javax.swing.JOptionPane;
import TDA.Prueba;
public class TestPrueba {
    
    public static void main (String[] args) {
        new Prueba();JOpane.imprimeSalida("El numero de referencias creadas son: "+Prueba.getContador(), "");
        new Prueba();JOpane.imprimeSalida("El numero de referencias creadas son: "+Prueba.getContador(), "");
        new Prueba();
        JOpane.imprimeSalida("El numero de referencias creadas son: "+Prueba.getContador(), "");
    }
    
}
