package TDAPadre;

public class Mamifero {
    
    protected String color;
    protected String tamaño;
    protected float peso;
    protected short edad;

    public Mamifero() {
    }

    public Mamifero(String color, String tamaño, float peso, short edad) {
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "color=" + color + ", tama\u00f1o=" + tamaño + ", peso=" + peso + ", edad=" + edad + '}';
    }
    
    
    
}
