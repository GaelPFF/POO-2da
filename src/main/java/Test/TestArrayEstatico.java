package Test;

import ArrayEstatico.ArrayIMC;
import ArregloDinamico.IMCArrayDinamico;
import EntradaSalida.JOpane;

public class TestArrayEstatico {
    public static void main(String [] args) {
        
        String opcion;
        
        ArrayIMC datos = new ArrayIMC((byte)10);
    do{
        
        opcion=JOpane.botonOpciones("Capturar Datos,Imprimir Datos,Ordenar,Buscar,Salir");
        switch(opcion){
            
            case "Capturar Datos": datos.agregarArray();
                break;
            case "Imprimir Datos": datos.imprimirDatos();
                break;
            case "Ordenar": 
                if (datos.arrayVacio()) JOpane.salidaError("El array esta vacio");
                
                else{
                    datos.ordenarBurbuja();
                    datos.imprimirDatos();
                }
            case "Buscar": 
                if(datos.arrayVacio()) JOpane.salidaError("El array esta vacio"); 
                else {
                    String auxNom=JOpane.leerString("Que nombre deseas buscar?:");
                    byte pos=datos.buscarDato(auxNom);
                    if (pos==-1)JOpane.salidaError("Lo siento, el dato "+auxNom+ "no existe en la lista de datos");
                    else JOpane.imprimeSalida("Si existe el dato:"+auxNom+ " en la posicion:" + pos, "Busqueda de dato");
                }
            case "Salir": JOpane.imprimeSalida("Gracias regresa pronto", "IMC");
                break;
            
            default :JOpane.salidaError("Opcion no definida");
        }
        
    }while(!opcion.equalsIgnoreCase("Salir"));
        
    }
}
