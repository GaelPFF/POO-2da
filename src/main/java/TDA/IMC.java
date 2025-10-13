package TDA;

public class IMC {
    private static byte contador = 1;
    private short folio;
    private String nombre;
    private byte edad;
    private float peso;
    private float estatura;

    public IMC(String nombre, byte edad, float peso, float estatura) {
        this.folio = contador ++;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public short getFolio() {
        return folio;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    public float getEstatura() {
        return estatura;
    }
    
    public byte getContador() {
        return contador;
    }

    public static void setContador(byte contador) {
        IMC.contador = contador;
    }

    public void setFolio(short folio) {
        this.folio = folio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
    

    @Override
    public String toString() {
        return "IMC{" + "folio=" + folio + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura + '}';
    }
    
    public float calcularImc (){
    return (peso/estatura);
    }
    
    public String clasificacionImc (){
    float imc=calcularImc();
    
    if (imc < 18.5)
        return "Peso insuficiente";
    else if (imc >= 18.5 && imc <= 24.9)
        return "Peso normal o saludable";
    else if (imc >= 25.0 && imc <= 29.9)
        return "Sobrepeso";
    else
        return "obesidad";
    }
    
    
}
