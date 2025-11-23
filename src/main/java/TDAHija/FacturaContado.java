package TDAHija;

import TDAPadre.Factura;

public abstract class FacturaContado extends Factura {
    private static int contador = 1;
    
    public FacturaContado(float montoTotal, byte diasPago){
        
        super (this.folio=generarFolio(), montoTotal, diasPago);
    } 
    
    public String pagoFactura() {
        return null;
    }
    
    public String generarFolio() {
        String num = String.format("%04d", contador++);
        return num + "-FCon";
    }
    
    
}
