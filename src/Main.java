import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Formas> lista = new ArrayList<>();
        lista.add(new Cilindro(1, 1, 1, 1));
        lista.add(new Circulo(1, 1, 3));
        lista.add(new Cilindro(3, 1, 1, 3));

        for(Formas forma : lista){
            System.out.println(forma.getClass().getSimpleName());
            System.out.println(forma);
            System.out.println("Área: "+forma.calcularArea());
            if (forma instanceof Volume) {
                System.out.println("Volume: "+ ((Cilindro) forma).calcularVolume());

            }
            System.out.println("--------------------------------------");
        }
    }
}

