
import java.util.ArrayList;

public class DispositivoElectronico {
    private final String fabricante; //inmutable
    private final String numeroSerie; //inmutable
    private final String marca; //inmutable
    private final String nombre; //inmutable
    private final float costo; //mutable
    ArrayList<ComponenteElectronico> componentes; //mutable usar  

    public DispositivoElectronico(ArrayList<ComponenteElectronico> componentes, float costo, String fabricante, String marca, String nombre, String numeroSerie) {
        this.componentes = componentes;
        this.costo = costo;
        this.fabricante = fabricante;
        this.marca = marca;
        this.nombre = nombre;
        this.numeroSerie = numeroSerie;
    }

    public void agregarComponente(ComponenteElectronico componente){
        componentes.add(componente);
    }
    
    public void quitarComponente(ComponenteElectronico componente){
        componentes.remove(componente);
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" +
                "fabricante='" + fabricante + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                '}';
    }
}
