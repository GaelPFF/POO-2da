package ArregloDinamico;

import EntradaSalida.JOpane;
import TDA.IMC;
import java.util.ArrayList;

public class IMCArrayDinamico {
    private ArrayList <IMC> datos;
    
    public IMCArrayDinamico(){
        datos = new ArrayList <IMC>();
    }
    
    public boolean arrayVacio(){
        return datos.isEmpty();
    }
    
    public IMC capturarPersona(){
        IMC obj = new IMC(JOpane.leerString("Ingresa tu nombre: "),
                                JOpane.leerByte("Ingresa tu edad: "),
                                JOpane.leerFloat("Ingresa tu peso: "),
                                JOpane.leerFloat("Ingresa tu estatura"));
        return obj;
    }
    
    public void agregarArray(){
        
        datos.add(capturarPersona());
    }
    
    public void imprimirDatos(){
        
        String unir = " ";
        for (byte j=0;j<datos.size();j++) {
            unir+=datos.get(j)+"su IMC es:" 
            + datos.get(j).calcularImc() 
            + "y tiene usted: "
            +datos.get(j).clasificacionImc()+"\n";
        }
        JOpane.imprimeSalida(unir, "listado");
    }
    
    public void ordenarBurbuja(){
            IMC aux=null;
            for (byte i=0;i<datos.size();i++)
                for (byte j=(byte) (i+1);j<datos.size();j++){
                if(datos.get(i).getEdad() > datos.get(j).getEdad()){
                    aux = datos.get(i);
                    datos.set(i, datos.get(j));
                    datos.set(j, aux);
                }
            }
    }
}
