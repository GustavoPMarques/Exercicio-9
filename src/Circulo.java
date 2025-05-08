public class Circulo extends Formas{

    public Circulo(int coordenadaX, int coordenadaY, double raio) {
        super(coordenadaX, coordenadaY, raio);
    }


    public double calcularArea() {
        return  (getRaio()*getRaio());
    }
}
