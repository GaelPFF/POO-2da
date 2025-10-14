package TDA;

public class Calificacion {
    private short cveAsig;
    private String nomAsig;
    private float promFinal;

    public Calificacion(short cveAsig, String nomAsig, float promFinal) {
        this.cveAsig = cveAsig;
        this.nomAsig = nomAsig;
        this.promFinal = promFinal;
    }

    public Calificacion() {}
    

    

    public short getCveAsig() {
        return cveAsig;
    }

    public void setCveAsig(short cveAsig) {
        this.cveAsig = cveAsig;
    }

    public String getNomAsig() {
        return nomAsig;
    }

    public void setNomAsig(String nomAsig) {
        this.nomAsig = nomAsig;
    }

    public float getPromFinal() {
        return promFinal;
    }

    public void setPromFinal(float promFinal) {
        this.promFinal = promFinal;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "cveAsig=" + cveAsig + ", nomAsig=" + nomAsig + ", promFinal=" + promFinal + '}';
    }
    
    

    
    
    
    
}
