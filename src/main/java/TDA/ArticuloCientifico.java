package TDA;

import java.util.ArrayList;

public class ArticuloCientifico {
    private String nombreArt;
    private String autor;
    private ArrayList <String> palabrasCve;
    private String nombrePubli;
    private short año;
    private String resumen;

    public ArticuloCientifico(String nombreArt, String autor) {
        this.nombreArt = nombreArt;
        this.autor = autor;
    }

    public ArticuloCientifico(String nombreArt, String autor, String nombrePubli, short año) {
        this(nombreArt, autor);
        this.palabrasCve = new ArrayList<String>();
        this.nombrePubli = nombrePubli;
        this.año = año;
    }

    public ArticuloCientifico(String nombreArt, String autor, String nombrePubli, short año, String resumen) {
        this(nombreArt, autor, nombrePubli, año);
        this.resumen = resumen;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPalabrasCve(ArrayList<String> palabrasCve) {
        this.palabrasCve = palabrasCve;
    }

    public void setNombrePubli(String nombrePubli) {
        this.nombrePubli = nombrePubli;
    }

    public void setAño(short año) {
        this.año = año;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        return "ArticuloCientifico{" + "nombreArt=" + nombreArt + ", autor=" + autor + ", palabrasCve=" + palabrasCve + ", nombrePubli=" + nombrePubli + ", a\u00f1o=" + año + ", resumen=" + resumen + '}';
    }
    
    public void agregarPalabraCve(String palabra){
        palabrasCve.add(palabra);
    }
    
    
    
    
    
    
    
}
