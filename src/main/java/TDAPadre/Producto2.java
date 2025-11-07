package TDAPadre;

import EntradaSalida.JOpane;

public class Producto2 {
    protected String codigo;
    protected String nombreProducto;
    protected float precioUnitario;
    protected byte cantidad;
    protected byte cantidadStock;
    protected static int correlativo = 1;

    public Producto2() {
    }

    public Producto2( String nombreProducto, float precioUnitario, byte cantidad, byte cantidadStock) {
       
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.cantidadStock = cantidadStock;
         this.codigo = generarCodigo();
        correlativo++;
    }
    
    private String generarCodigo() {
        String prefijo = "";

        if (nombreProducto.equalsIgnoreCase("zapatos")) {
            prefijo = "ZAP";
        } else if (nombreProducto.equalsIgnoreCase("ropa")) {
            prefijo = "ROP";
        } else if (nombreProducto.equalsIgnoreCase("perfume")) {
            prefijo = "PER";
        } else {
            prefijo = "DES";
        }

        int dia = JOpane.leerInt("Ingresa el día de registro: ");
        int mes = JOpane.leerInt("Ingresa el mes de registro: ");
        int año = JOpane.leerInt("Ingresa el año de registro: ");

        correlativo++;
        
        String codigo=(prefijo +"-"+ correlativo +"-"+ dia +"-"+ mes +"-"+ año);
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public void setCantidadStock(byte cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public static int getCorrelativo() {
        return correlativo;
    }
    
    public float calcularTotal(){
        return precioUnitario * cantidad;
    }
    
    @Override
    public String toString() {
        return "Producto2{" + "codigo=" + codigo + ", nombreProducto=" + nombreProducto + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad + ", cantidadStock=" + cantidadStock + '}';
    }
    
    
}
