package TDA;

import java.util.ArrayList;

import EntradaSalida.JOpane;

public class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;
    
    public Universidad(String nombre){
        this.nombre=nombre;
        this.estudiantes = new ArrayList<Estudiante>();
        this.profesores = new ArrayList<Profesor>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean arrayProfVacio(){
        return profesores.isEmpty();
    }
    
    public boolean arrayEstVacio(){
        return estudiantes.isEmpty();
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    
    public void agregarProfesor(Profesor profesor){
        profesores.add(profesor);
    }
    
    public void mostrarEstudiantes(){
        String cad=nombre + ":\n";
        for (Estudiante estudiante : estudiantes) {
            cad+=estudiante.toString()+"\n";
        }
        JOpane.imprimeSalida(cad, "Estudiantes");
    }
    
    public void mostrarProfesor(){
        String cad="Maestros en " + nombre +":\n";
        for (Profesor profesor : profesores){
            cad+=profesor.toString()+"\n";
        }
        JOpane.imprimeSalida(cad,"Profesores");
    }
    
    public byte buscarProfesor(){
        short clave = JOpane.leerShort("INGRESA LA CLAVE DEL PROFESOR:");
        for(byte j=0;j<profesores.size();j++){
                if (profesores.get(j).getCveProfesor() == clave)
                    return j;
            }
            return -1;
        }
    
    public void asignaProfCalif(){
        Profesor prof =profesores.get(buscarProfesor());
        if (prof==null) JOpane.salidaError("No esxiste el profesor!!");
        else {
            String cad="";
            JOpane.imprimeSalida("Profesor que asignara calificaciones"+prof.toString(),"Profesor");
            for(byte j=0;j<estudiantes.size();j++){
                Estudiante est =estudiantes.get(j);
                Calificacion cal=new Calificacion((short)123,
                        "Programacion Orientada a Objeto",
                        JOpane.leerFloat("Calificacion final:"));
                cad+= prof.asignarCalificacion(est, cal)+"";
                
            }
            JOpane.imprimeSalida(cad,"Calificaciones");
        }
    }
}
