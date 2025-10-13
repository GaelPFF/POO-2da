package Test;

import EntradaSalida.JOpane;
import ArrayEstatico.ArrayIMC;
import ArregloDinamico.IMCArrayDinamico;


public class TestImc {
    
    public static void main(String [] args) {
        
        String opcion;
        
        IMCArrayDinamico datos = new IMCArrayDinamico();
    do{
        
        opcion=JOpane.botonOpciones("Capturar Datos,Imprimir Datos,Ordenar,Salir");
        switch(opcion){
            
            case "Capturar Datos": datos.agregarArray();
                break;
            case "Imprimir Datos":
                if(datos.arrayVacio()) JOpane.salidaError("Lo siento, el arreglo esta vacio" + "Intenta de nuevo"); 
                    else datos.imprimirDatos();
                break;
            case "Ordenar": 
                if (datos.arrayVacio()) JOpane.salidaError("El array esta vacio");
                
                else{
                    datos.ordenarBurbuja();
                    datos.imprimirDatos();
                }
            case "Salir": JOpane.imprimeSalida("Gracias regresa pronto", "IMC");
                break;
            default :JOpane.salidaError("Opcion no definida");
        }
        
    }while(!opcion.equalsIgnoreCase("Salir"));
        
    }
    
    }

    
    
    
    

    
    
    

