
import java.util.ArrayList;

public class Smartphone extends Computadora {
    Sensor sensorDeHuella; //inmutable
    Pantalla pantalla; //inmutable

    public Smartphone(ArrayList<ComponenteElectronico> componentes, float costo, String fabricante, String marca, String nombre, String numeroSerie) {
        super(componentes, costo, fabricante, marca, nombre, numeroSerie);
    }

    @Override
    public String toString() {
        return "Smartphone{" + super.toString() + ", sensorDeHuella=" + sensorDeHuella + ", pantalla=" + pantalla + '}';
    }


}
