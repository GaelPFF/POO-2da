package TDAPadre;

public abstract class Factura {
    protected String folio;
    protected float montoTotal;
    protected byte diasPago;

    public Factura(String folio, float montoTotal, byte diasPago) {
        this.folio = folio;
        this.montoTotal = montoTotal;
        this.diasPago = diasPago;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setDiasPago(byte diasPago) {
        this.diasPago = diasPago;
    }
    
    // Metodo abstracto que obliga la implementacion en subclases
    public abstract String pagoFactura();
    public abstract String generarFolio();

    @Override
    public String toString() {
        return "Factura{" + "folio=" + folio + ", montoTotal=" + montoTotal + ", diasPago=" + diasPago + '}';
    }
    
    
}
