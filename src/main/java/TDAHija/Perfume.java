package TDAHija;

import TDAPadre.Producto2;
 public class Perfume extends Producto2{
    private String aromaPerfume;
    private short volumen;

    public Perfume(){
        super();
    }
    public Perfume(String nombreProducto, float precioUnitario, byte cantidad, byte cantidadStock,
                   String aromaPerfume, short volumen) {
        super(nombreProducto, precioUnitario, cantidad, cantidadStock);
        this.aromaPerfume = aromaPerfume;
        this.volumen = volumen;
    }

    public String getAromaPerfume() {
        return aromaPerfume;
    }

    public void setAromaPerfume(String aromaPerfume) {
        this.aromaPerfume = aromaPerfume;
    }

    public short getVolumen() {
        return volumen;
    }

    public void setVolumen(short volumen) {
        this.volumen = volumen;
    }
    
    protected String obtenerPrefijo() {
        return "PER";
    }


    
    public float calcularTotal() {
        float total = precioUnitario * cantidad;
        if (volumen == 100) {
            total *= 0.90; // aplica 10% de descuento si es igual a 100 ml
        } else if (volumen == 150) {
            total *= 0.80; // aplica 20% de descuento si es igual a 150 ml
        }
        return total;
    }

    @Override
    public String toString() {
        return "----------PERFUME ------------\n" + super.toString() +
                "\nAroma: " + aromaPerfume +
                "\nMarca: " + volumen;
    }
}
