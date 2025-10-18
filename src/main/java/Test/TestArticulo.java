package Test;

import EntradaSalida.JOpane;
import TDA.ArticuloCientifico;

public class TestArticulo {
    public static void main(String[] args) {
        // === 1️⃣ Primer artículo (usa el primer constructor: nombre y autor) ===
        String nombreArt1 = JOpane.leerString("Artículo 1 - Nombre del artículo:");
        String autor1 = JOpane.leerString("Artículo 1 - Autor:");
        ArticuloCientifico art1 = new ArticuloCientifico(nombreArt1, autor1);

        int numPalabras1 = Integer.parseInt(JOpane.leerString("¿Cuántas palabras clave tendrá el artículo 1?"));
        for (int i = 0; i < numPalabras1; i++) {
            String palabra = JOpane.leerString("Palabra clave " + (i + 1) + " del artículo 1:");
            art1.agregarPalabraCve(palabra);
        }

        // === 2️⃣ Segundo artículo (usa el segundo constructor: nombre, autor, publicación, año) ===
        String nombreArt2 = JOpane.leerString("Artículo 2 - Nombre del artículo:");
        String autor2 = JOpane.leerString("Artículo 2 - Autor:");
        String nombrePubli2 = JOpane.leerString("Artículo 2 - Nombre de la publicación:");
        short año2 = JOpane.leerShort("Artículo 2 - Año de publicación:");
        ArticuloCientifico art2 = new ArticuloCientifico(nombreArt2, autor2, nombrePubli2, año2);

        int numPalabras2 = JOpane.leerInt("¿Cuántas palabras clave tendrá el artículo 2?");
        for (int i = 0; i < numPalabras2; i++) {
            String palabra = JOpane.leerString("Palabra clave " + (i + 1) + " del artículo 2:");
            art2.agregarPalabraCve(palabra);
        }

        // === 3️⃣ Tercer artículo (usa el tercer constructor: nombre, autor, publicación, año y resumen) ===
        String nombreArt3 = JOpane.leerString("Artículo 3 - Nombre del artículo:");
        String autor3 = JOpane.leerString("Artículo 3 - Autor:");
        String nombrePubli3 = JOpane.leerString("Artículo 3 - Nombre de la publicación:");
        short año3 = JOpane.leerShort("Artículo 3 - Año de publicación:");
        String resumen3 = JOpane.leerString("Artículo 3 - Resumen:");
        ArticuloCientifico art3 = new ArticuloCientifico(nombreArt3, autor3, nombrePubli3, año3, resumen3);

        int numPalabras3 = Integer.parseInt(JOpane.leerString("¿Cuántas palabras clave tendrá el artículo 3?"));
        for (int i = 0; i < numPalabras3; i++) {
            String palabra = JOpane.leerString("Palabra clave " + (i + 1) + " del artículo 3:");
            art3.agregarPalabraCve(palabra);
        }

        // === Mostrar toda la información ===
        String salida = "=== ARTÍCULOS CIENTÍFICOS ===\n\n" +
                        art1.toString() +
                        art2.toString() +
                        art3.toString();

        JOpane.imprimeSalida(salida, salida);
    }
}
    

