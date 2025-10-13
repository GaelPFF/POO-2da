package Test;

import ArregloDinamico.IMCArrayDinamico;
import EntradaSalida.JOpane;
import TDA.Estudiante;
import TDA.Profesor;
import TDA.Universidad;

public class TestUniversidad {
    public static void main(String [] args){
        String opcion;
        
        Universidad uni=new Universidad("University of Oxford");
    do{
        
        opcion=JOpane.botonOpciones("Agregar estudiante,Agregar profesor,Buscar profesor,Imprimir,Salir");
        switch(opcion){
            
            case "Agregar estudiante":
                
                Estudiante estudiante = new Estudiante(JOpane.leerString("ingresa num de control:"),
                                                       JOpane.leerString("Nombre de estudiante:"),
                                                       JOpane.leerString("Ingresa carrera:"));
                uni.agregarEstudiante(estudiante);
                uni.mostrarEstudiantes();
                break;
            case "Agregar profesor":
                
                Profesor profesor = new Profesor (JOpane.leerShort("C;ave de profesor:"),
                                                  JOpane.leerString("Nombre de profesor"),
                                                  JOpane.leerString("A que depto pertenece?"));
                uni.agregarProfesor(profesor);
                uni.mostrarProfesor();
                break;
            case "Imprimir":uni.mostrarEstudiantes();
                            uni.mostrarProfesor();
                break;
            case "Buscar profesor": 
                if (uni.buscarProfesor()==-1)
                    JOpane.salidaError("El profesor no existe");
                else {
                    JOpane.imprimeSalida("El profesor si existe", opcion);
                }
                
                break;
            case "Salir": JOpane.imprimeSalida("Gracias regresa pronto", "IMC");
                break;
        }
        
    }while(!opcion.equalsIgnoreCase("Salir"));
        
    }
}
