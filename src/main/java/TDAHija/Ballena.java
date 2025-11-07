package TDAHija;

import TDAPadre.Mamifero;

public class Ballena extends Mamifero {
    private String tipoBallena;
    private float longitudAletas;
    
    public Ballena(){
        super();
    }
    
    public Ballena (String color, String tamaño, float peso, short edad, String tipoBallena, float longitudAletas){
        super(color, tamaño, peso, edad);
        this.tipoBallena=tipoBallena;
        this.longitudAletas=longitudAletas;
    }

    public void setTipoBallena(String tipoBallena) {
        this.tipoBallena = tipoBallena;
    }

    public void setLongitudAletas(float longitudAletas) {
        this.longitudAletas = longitudAletas;
    }

    @Override
    public String toString() {
        return "Ballena{" + "tipoBallena=" + tipoBallena + ", longitudAletas=" + longitudAletas + '}';
    }
    
    
    
}
