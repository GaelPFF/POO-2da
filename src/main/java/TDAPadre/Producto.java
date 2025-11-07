package TDAPadre;

public class Producto {
    protected String nombre;
    protected float precioUn;
    protected int cantidad;

    public Producto() {
    }

    public Producto(String nombre, float precioUn, int cantidad) {
        this.nombre = nombre;
        this.precioUn = precioUn;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioUn(float precioUn) {
        this.precioUn = precioUn;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float calcularTotal(){
        return precioUn * cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioUn=" + precioUn + ", cantidad=" + cantidad + '}';
    }
    
}
