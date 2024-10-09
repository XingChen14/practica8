import java.util.*;

public class DispositivoElectronicoDeConsumo extends DispositivoElectronico {
    private boolean encendiendo;

    public DispositivoElectronicoDeConsumo(ArrayList<ComponenteElectronico> componentes, float costo, String fabricante, String marca, String nombre, String numeroSerie) {
        super(componentes, costo, fabricante, marca, nombre, numeroSerie);
        this.encendiendo = false; // Valor inicial por defecto
    }

    public boolean encender() {
        encendiendo = true; // Cambia el estado a encendido
        return encendiendo;
    }

    public boolean apagar() {
        encendiendo = false; // Cambia el estado a apagado
        return encendiendo;
    }

    public boolean isEncendiendo() {
        return encendiendo;
    }

    @Override
    public String toString() {
        return "DispositivoElectronicoDeConsumo{" + super.toString() + ", encendiendo=" + encendiendo + '}';
    }
}
