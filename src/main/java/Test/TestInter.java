package Test;

import EntradaSalida.JOpane;
import PolimorfismoSimple.ArrayDinamico;

public class TestInter {
    public static void main(String[] args){
        String opcion;
        
        ArrayDinamico datos = new ArrayDinamico();
    do{
        
        opcion=JOpane.botonOpciones("Agregar,Imprime un dato,Eliminar,Mostrar,Total datos,Limpiar,Salir");
        switch(opcion){
            
            case "Agregar":datos.agregar(JOpane.leerString("Ingresa nombre de personas: ").toUpperCase());
                break;
            case "Imprime un dato":if (datos.arrayVacio())
                JOpane.salidaError("Array Vacio!!!");
            else JOpane.imprimeCuadro("Uso de interfaces", datos.obtenerDato(JOpane.leerByte("Que posicion deseas?: ")));
                break;
            case "Eliminar":if (datos.arrayVacio())
                JOpane.salidaError("Array Vacio!!!");
            else {
                JOpane.imprimeSalida("Que Pocision deseas eliminar?: ", datos.toString());
                datos.eliminar(JOpane.leerByte("Que posicion deseas eliminar?: "));
                JOpane.imprimeSalida("Datos del array despues de eliminar", datos.toString());
            }
                break;
            case "Mostrar":if (datos.arrayVacio())
                JOpane.salidaError("Array Vacio!!!");
            else JOpane.imprimeCuadro("Uso de interfaces", datos.mostrar());
                break;
            case "Total datos":if (datos.arrayVacio())
                JOpane.salidaError("Array Vacio!!!");
            else JOpane.imprimeCuadro("Uso de interfaces", "Total de datos capturados: "+datos.tamaño());
                break;
            case "Limpiar":JOpane.verDatos("Se procedera a eliminar la informacion del Array!!");
                datos.limpiar();
                break;
            case "Salir":
                break;
            default :JOpane.salidaError("Opcion no definida");
        }
        
    }while(!opcion.equalsIgnoreCase("Salir"));
    }
}
