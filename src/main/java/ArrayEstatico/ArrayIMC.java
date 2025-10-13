package ArrayEstatico;

import EntradaSalida.JOpane;
import TDA.IMC;

public class ArrayIMC {
    private IMC datos[];
    private byte pos;
    
    public ArrayIMC (byte tot){
    datos = new IMC[tot];
    pos = -1;
    }
    
    public boolean arrayVacio(){
        return pos== -1;
    }
    
        public IMC capturarPersona(){
        IMC obj = new IMC(JOpane.leerString("Ingresa tu nombre: "),
                                JOpane.leerByte("Ingresa tu edad: "),
                                JOpane.leerFloat("Ingresa tu peso: "),
                                JOpane.leerFloat("Ingresa tu estatura"));
        
        return obj;
    }
        
        public void agregarArray(){
        
        if (pos < datos.length)
        {
            datos[pos+1]=capturarPersona();
            pos++;
        }
        else
            JOpane.salidaError("Array lleno");
        }
        
        public void imprimirDatos(){
            
            String unir=" ";
            for(byte j=0;j<=pos;j++) {
                unir+=datos[j].toString()+"su IMC es:"+ datos[j].calcularImc()+"y tiene usted: "+datos[j].clasificacionImc()+"\n";
            }
            JOpane.imprimeSalida("Tus datos son" + unir,"IMC");
        }
        
        
        public void ordenarBurbuja(){
            IMC aux=null;
            for (byte i=0;i<pos;i++)
                for (byte j=(byte) (i+1);j<=pos;j++){
                if(datos[i].getEdad()>datos[j].getEdad()){
                    aux=datos[i];
                    datos[i]=datos[j];
                    datos[j]=aux;
                }
                }
        }
        
        public byte buscarDato(String nom){
            for(byte j=0;j<=pos;j++){
                if (datos[j].getNombre().compareTo(nom)==0)
                    return j;
            }
            return -1;
        }
        
        
            
    
    
}
