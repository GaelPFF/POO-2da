package TDA;

public class Pedido {
    
    private String primerPlato;
    private float precioPrimerPlato;
    
    private String segundoPlato;
    private float precioSegundoPlato;
    
    private String bebida;
    private float precioBebida;
    
    private String postre;
    private float precioPostre;

    public Pedido(String primerPlato, String segundoPlato, String bebida, String postre) {
        this.primerPlato = primerPlato;
        this.precioPrimerPlato = precioPlato1();
        this.segundoPlato = segundoPlato;
        this.precioSegundoPlato = precioPlato2();
        this.bebida = bebida;
        this.precioBebida = precioBebida();
        this.postre = postre;
        this.precioPostre = precioPostre();
    }
    
    //BIEN DESDE PRIMER INTENTO

    
    
    
    public String getPrimerPlato() {
        return primerPlato;
    }

    public void setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
    }

    public float getPrecioPrimerPlato() {
        return precioPrimerPlato;
    }

    public void setPrecioPrimerPlato(float precioPrimerPlato) {
        this.precioPrimerPlato = precioPrimerPlato;
    }

    public String getSegundoPlato() {
        return segundoPlato;
    }

    public void setSegundoPlato(String segundoPlato) {
        this.segundoPlato = segundoPlato;
    }

    public float getPrecioSegundoPlato() {
        return precioSegundoPlato;
    }

    public void setPrecioSegundoPlato(float precioSegundoPlato) {
        this.precioSegundoPlato = precioSegundoPlato;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public float getPrecioBebida() {
        return precioBebida;
    }

    public void setPrecioBebida(float precioBebida) {
        this.precioBebida = precioBebida;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public float getPrecioPostre() {
        return precioPostre;
    }

    public void setPrecioPostre(float precioPostre) {
        this.precioPostre = precioPostre;
    }
    
    private float precioPlato1(){
        float pre = 0;
        switch (primerPlato){
            case "Sopa de verduras":pre=50f;
            break;
            case "Ensalada cesar":pre=60f;
            break;
            case "Crema de champiñones":pre=55f;
            break;
        }
        return pre;
    }
    
    private float precioPlato2(){
        float pre = 0;
        switch (segundoPlato){
            case "Pollo al horno":pre=95.99f;
            break;
            case "Carne asada":pre=125.99f;
            break;
            case "Pescado empanizado":pre=145.99f;
            break;
        }
        return pre;
    }
    
    private float precioBebida(){
        float pre = 0;
        switch(bebida){
            case "Agua mineral":pre=29.99f;
            break;
            case "Refresco":pre=39.99f;
            break;
            case "Jugo natural":pre=35.0f;
            break;
        }
        return pre;
    }
    
    private float precioPostre(){
        float pre = 0;
        switch(postre){
            case "Flan":pre=35f;
            break;
            case "Pastel de chocolate":pre=45f;
            break;
            case "Helado":pre=40f;
            break;
        }
        return pre;
    }
    
    public float calcularValorPedido(float precioPrimerPlato, float precioBebida){
        return precioPrimerPlato+precioBebida;
    }
    
    public float calcularValorPedido(float precioPrimerPlato, float precioSegundoPlato, float precioBebida){
        return precioPrimerPlato+precioSegundoPlato+precioBebida;
    }
    
    public float calcularValorPedido(float precioPrimerPlato, float precioSegundoPlato, float precioBebida, float precioPostre){
        return precioPrimerPlato+precioSegundoPlato+precioBebida+precioPostre;
    }
    
}
