public class Datos {
    String palabra;
    double numero ;
    int entero;
    int a;

    public Datos(String palabra, double numero, int entero, int a) {
        this.palabra = palabra;
        this.numero = numero;
        this.entero = entero;
        this.a=a;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
