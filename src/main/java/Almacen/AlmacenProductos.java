package Almacen;

import java.util.ArrayList;
import EntradaSalida.JOpane;
import TDAPadre.Producto;
import TDAHija.ProductoPerecedero;

public class AlmacenProductos {

    private ArrayList<Producto> productos;

    // Constructor
    public AlmacenProductos() {
        productos = new ArrayList<>();
    }

    // Método para agregar productos no perecederos
    public void agregarNoPerecedero() {
        String nombre = JOpane.leerString("Ingrese el nombre del producto:");
        float precio = JOpane.leerFloat("Ingrese el precio unitario del producto:");
        int cantidad = JOpane.leerInt("Ingrese la cantidad del producto:");

        Producto p = new Producto(nombre, precio, cantidad);
        productos.add(p);

        JOpane.imprimeSalida("Producto agregado correctamente", "Registro exitoso");
    }

    // Método para agregar productos perecederos
    public void agregarPerecedero() {
        String nombre = JOpane.leerString("Ingrese el nombre del producto perecedero:");
        float precio = JOpane.leerFloat("Ingrese el precio unitario del producto:");
        int cantidad = JOpane.leerInt("Ingrese la cantidad del producto:");
        int dias = JOpane.leerInt("Ingrese los días de caducidad:");

        ProductoPerecedero p = new ProductoPerecedero(nombre, precio, cantidad, dias);
        productos.add(p);

        JOpane.imprimeSalida("Producto perecedero agregado correctamente", "Registro exitoso");
    }

    // Método para mostrar todos los productos (usando toString)
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            JOpane.salidaError("No hay productos registrados ❌");
            return;
        }

        String lista = "LISTA DE PRODUCTOS:\n\n";
        for (Producto p : productos) {
            lista += p.toString() + "\nTotal: $" + p.calcularTotal() + "\n-----------------------\n";
        }

        JOpane.imprimeCuadro("Inventario del Almacén", lista);
    }

    // Método para buscar producto por nombre
    public void buscarProducto() {
        if (productos.isEmpty()) {
            JOpane.salidaError("No hay productos registrados para buscar");
            return;
        }

        String nombre = JOpane.leerString("Ingrese el nombre del producto a buscar:");
        boolean encontrado = false;

        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                JOpane.imprimeCuadro("Producto encontrado", p.toString() + "\nTotal: $" + p.calcularTotal());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOpane.salidaError("Producto no encontrado");
        }
    }

    // Método para eliminar producto
    public void eliminarProducto() {
        if (productos.isEmpty()) {
            JOpane.salidaError("No hay productos registrados para eliminar");
            return;
        }

        String nombre = JOpane.leerString("Ingrese el nombre del producto a eliminar:");
        Producto productoAEliminar = null;

        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                productoAEliminar = p;
                break;
            }
        }

        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            JOpane.imprimeSalida("Producto eliminado correctamente", "Eliminación exitosa");
        } else {
            JOpane.salidaError("No se encontró el producto con ese nombre");
        }
    }
}

