
import java.util.ArrayList;

public class Pantalla extends ComponenteElectronico {
    private int resolucionX; //inmutable
    private int resolucionY; //inmutable

    public Pantalla(ArrayList<ComponenteElectronico> componentes, float costo, String fabricante, String marca, String nombre, String numeroSerie) {
        super(componentes, costo, fabricante, marca, nombre, numeroSerie);
    }

    @Override
    public String toString() {
        return "Pantalla{" + super.toString() + ", resolucionX=" + resolucionX + ", resolucionY=" + resolucionY + '}';
    }


}
