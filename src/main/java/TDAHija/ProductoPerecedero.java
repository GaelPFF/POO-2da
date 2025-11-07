package TDAHija;

import TDAPadre.Producto;

public class ProductoPerecedero extends Producto {
    protected int diasCaducidad;

    public ProductoPerecedero(String nombre, float precioUn, int cantidad, int diasCaducidad) {
        super(nombre, precioUn, cantidad);
        this.diasCaducidad = diasCaducidad;
    }

public float calcularTotal() {
    float total = super.calcularTotal();

    if (diasCaducidad <= 5) {
        total = total - (total * 0.25f);
    } else if (diasCaducidad <= 15) {
        total = total - (total * 0.33f);
    } else if (diasCaducidad <= 30) {
        total = total - (total * 0.50f);
    }

    return total;
}

    @Override
    public String toString() {
        return super.toString() + 
               "\nDías para caducar: " + diasCaducidad +
               "\n(Total ajustado: $" + calcularTotal() + ")";
    }
}
