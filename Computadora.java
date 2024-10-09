import java.util.ArrayList;

public class Computadora extends DispositivoElectronico{
    Microprocesador cpu; //mutable
    private long ramMB; //mutable

    public Computadora(ArrayList<ComponenteElectronico> componentes, float costo, String fabricante, String marca, String nombre, String numeroSerie) {
        super(componentes, costo, fabricante, marca, nombre, numeroSerie);
    }

    @Override
    public String toString() {
        return "Computadora{" + super.toString() + '}';
    }
}
