package Menus;

import EntradaSalida.JOpane;

public class MenuBotones {
    String opcion;
    
    do{
        
        opcion=JOpane.botonOpciones("Agregar,Imprime un dato,Eliminar,Mostrar,Total datos,Limpiar,Salir");
        switch(opcion){
            
            case "Agregar":
                break;
            case "Imprime un dato":
                break;
            case "Eliminar":
                break;
            case "Mostrar":
                break;
            case "Total datos":
                break;
            case "Limpiar":
                break;
            case "Salir":
                break;
            default :JOpane.salidaError("Opcion no definida");
        }
        
    }while(!opcion.equalsIgnoreCase("Salir"));
}
