package TDA;

import java.util.ArrayList;

public class Estudiante {
    private String numControl;
    private String nomEst;
    private String carrera;
    private ArrayList <Calificacion> calif;

    public Estudiante(String numControl, String nomEst, String carrera) {
        this.numControl = numControl;
        this.nomEst = nomEst;
        this.carrera = carrera;
        this.calif = new ArrayList<>();
        
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNomEst() {
        return nomEst;
    }

    public void setNomEst(String nomEst) {
        this.nomEst = nomEst;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void agregarcalificacion(Calificacion calificacion){
        calif.add(calificacion);
    }
    
    public String mostrarCalificacion(){
        String cad=" ";
        for (Calificacion calificacion : calif) {
            cad+=" "+calificacion.getNomAsig()+"==> [ "+calificacion.getPromFinal()+" ] ";
        }
        return cad;
    }

    public String toString() {
        return "Estudiante [Numero de control=" + numControl + 
                ", nombre del estudiante=" + nomEst + 
                ", carrera=" + carrera + ", calificaciones=" 
                +mostrarCalificacion() + "}";
    }
    
    
    
    
}
