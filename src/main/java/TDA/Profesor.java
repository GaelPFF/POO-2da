package TDA;

public class Profesor {
    private short cveProfesor;
    private String nomProfesor;
    private String area;

    public Profesor(short cveProfesor, String nomProfesor, String area) {
        this.cveProfesor = cveProfesor;
        this.nomProfesor = nomProfesor;
        this.area = area;
    }

    public void setCveProfesor(short cveProfesor) {
        this.cveProfesor = cveProfesor;
    }

    public void setNomProfesor(String nomProfesor) {
        this.nomProfesor = nomProfesor;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public short getCveProfesor() {
        return cveProfesor;
    }

    public String getNomProfesor() {
        return nomProfesor;
    }

    public String getArea() {
        return area;
    }
    

    @Override
    public String toString() {
        return "Profesor{" + "cveProfesor=" + cveProfesor + ", nomProfesor=" + nomProfesor + ", area=" + area + '}';
    }
    
    
    public String asignarCalificacion(Estudiante estudiante, short cveAsig, String nomAsig, float promFinal) {
        Calificacion calificacion = new Calificacion(cveAsig, nomAsig, promFinal);
        estudiante.agregarcalificacion(calificacion);
        return "El maestro ==>" + nomProfesor + " ha asignado la calificacion de= " + calificacion.getPromFinal();
        
    }
    
}
