package TDA;

public class Prueba {
    
    //declaramos e inicializamos la variable estatica
    private static int contador = 0;

    public Prueba() {
        //Se modifica el valor del constructor
    contador ++;
    }

    public static int getContador() {
        return contador;
    }
    
    
    
    
}
