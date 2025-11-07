package TDAHija;

import TDAPadre.Producto;
import java.time.LocalDate;

public class ProductoNoPerecedero extends Producto {
    private String codigoDeInventario;

    public ProductoNoPerecedero(String nombre, float precioUn, int cantidad, String categoria, int correlativo) {
        super(nombre, precioUn, cantidad);
        this.codigoDeInventario = generarCodigo(categoria, correlativo);
    }

    private String generarCodigo(String categoria, int correlativo) {
        LocalDate fecha = LocalDate.now();
        String prefijo = categoria.substring(0, 2).toUpperCase();
        return prefijo + "-" + categoria.substring(0, 3).toUpperCase() + "-" +
               String.format("%03d", correlativo) + "-" +
               fecha.getYear() + fecha.getMonthValue() + fecha.getDayOfMonth();
    }

    public String getCodigoDeInventario() {
        return codigoDeInventario;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCódigo de inventario: " + codigoDeInventario;
    }
}
