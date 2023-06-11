import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Fiesta());
        carros.add(new Gol());
        carros.add(new Astra());
        carros.add(new Honda());
        carros.add(new Vectra());
        carros.add(new Celta());

        listacarros(carros);
    }

    private static void listacarros(List<Carro> carros) {
        System.out.println("Lista de carros: ");
        for(Carro carro: carros){
            System.out.println(carro.getMarca());
        }
    }
}
