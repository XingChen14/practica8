import java.util.ArrayList;

public class Sensor extends ComponenteElectronico {
    private String tipo; //inmutable
    private String unidadDeMedida; //inmutable
    private int valor; //inmutable

    public Sensor(ArrayList<ComponenteElectronico> componentes,float costo, String fabricante, String marca, String nombre, String numeroSerie, String tipo, String unidadDeMedida, int valor) {
        super(componentes, costo, fabricante, marca, nombre, numeroSerie);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Sensor{" + super.toString() + ", tipo='" + tipo + '\'' + ", unidadDeMedida='" + unidadDeMedida + '\'' + ", valor=" + valor + '}';
    }

} 
