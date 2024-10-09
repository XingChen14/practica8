
import java.util.ArrayList;

public class Television extends DispositivoElectronico {
    Pantalla pantalla; //inmutable

    public Television(ArrayList<ComponenteElectronico> componentes, float costo, String fabricante, String marca, String nombre, String numeroSerie) {
        super(componentes, costo, fabricante, marca, nombre, numeroSerie);
    }

    @Override
    public String toString() {
        return "Television{" + super.toString() + ", pantalla=" + pantalla + '}';
    }
}
