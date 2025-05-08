public class Cilindro extends Formas{
    private double altura;

    public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
        super(coordenadaX, coordenadaY, raio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return 2;
    }
    public double calcularVolume() {
        return 3;
    }

    public String toString() {
        String aux = super.toString();
        aux += "Altura: "+ altura + "\n";
        return aux;
    }
}
