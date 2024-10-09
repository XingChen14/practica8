import java.util.ArrayList;

public class ComponenteElectronico extends DispositivoElectronico {

    public ComponenteElectronico(ArrayList<ComponenteElectronico> componentes, float costo, String fabricante, String marca, String nombre, String numeroSerie) {
        super(componentes, costo, fabricante, marca, nombre, numeroSerie);
    }
    //mutable

    @Override
    public String toString() {
        return "ComponenteElectronico{" + super.toString() + '}';
    }
}
