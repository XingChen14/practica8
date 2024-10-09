
import java.util.ArrayList;

public class Microprocesador extends ComponenteElectronico {
    private int cacheRAM; //inmutable
    private long velocidadHz; //inmutable

    public Microprocesador(ArrayList<ComponenteElectronico> componentes, float costo, String fabricante, String marca, String nombre, String numeroSerie) {
        super(componentes, costo, fabricante, marca, nombre, numeroSerie);
    }

    @Override
    public String toString() {
        return "Microprocesador{" + super.toString() + ", cacheRAM=" + cacheRAM + ", velocidadHz=" + velocidadHz + '}';
    }
}
