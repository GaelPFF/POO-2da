package Test;

import EntradaSalida.JOpane;
import TDA.Pedido;

public class TestRestaurante {
    Pedido ped = new Pedido(JOpane.plato1("Escoge tu plato 1:"),
            JOpane.plato2("Escoge tu segundo plato"),
            JOpane.bebida("Escoge tu bebida"),
            JOpane.postre("Escoge tu postre"));
    
}
