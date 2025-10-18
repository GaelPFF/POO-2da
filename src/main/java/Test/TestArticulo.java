package Test;

import EntradaSalida.JOpane;
import TDA.ArticuloCientifico;

public class TestArticulo {
    public static void main(String[] args) {

        ArticuloCientifico art1 = new ArticuloCientifico(
                JOpane.leerString("Ingresa el nombre del artículo: "),
                JOpane.leerString("Ingresa el nombre del autor: ")
        );

        ArticuloCientifico art2 = new ArticuloCientifico(
                JOpane.leerString("Ingresa el nombre del artículo: "),
                JOpane.leerString("Ingresa el nombre del autor: "),
                JOpane.leerString("Ingresa el nombre de la publicación: "),
                (short) JOpane.leerInt("Ingresa el año de publicación: ")
        ) {
            {
                int continuar;
                do {
                    String palabra = JOpane.leerString("Agrega una palabra clave para el artículo 2:");
                    agregarPalabraCve(palabra);
                    continuar = JOpane.seguirSino();
                } while (continuar == 0);
            }
        };

        ArticuloCientifico art3 = new ArticuloCientifico(
                JOpane.leerString("Ingresa el nombre del artículo: "),
                JOpane.leerString("Ingresa el nombre del autor: "),
                JOpane.leerString("Ingresa el nombre de la publicación: "),
                (short) JOpane.leerInt("Ingresa el año de publicación: "),
                JOpane.leerString("Escribe un breve resumen del artículo: ")
        ) {
            {
                int continuar;
                do {
                    String palabra = JOpane.leerString("Agrega una palabra clave para el artículo 3:");
                    agregarPalabraCve(palabra);
                    continuar = JOpane.seguirSino();
                } while (continuar == 0);
            }
        };

        // Mostrar los resultados con tu clase JOpane
        JOpane.imprimeSalida( art1.toString() + "\n\n" +
                art2.toString() + "\n\n" +
                art3.toString(),"Artículos científicos capturados");
               
    }
}
