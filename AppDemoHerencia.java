import java.util.ArrayList;

public class AppDemoHerencia {
    public static void main(String[] args) {
        // Crear componentes para los smartphones
        Sensor sensorSamsung = new Sensor(new ArrayList<>(), 49.99f, "Samsung", "Sensor Huella", "Huella", "SN123", "Huella", "mm", 10);
        Pantalla pantallaSamsung = new Pantalla(new ArrayList<>(), 199.99f, "Samsung", "Super AMOLED", "Pantalla S21", "SN456");

        Sensor sensorApple = new Sensor(new ArrayList<>(), 59.99f, "Apple", "Sensor Huella", "Huella", "SN789", "Huella", "mm", 10);
        Pantalla pantallaApple = new Pantalla(new ArrayList<>(), 299.99f, "Apple", "Retina Display", "Pantalla iPhone", "SN012");

        // Crear lista de componentes
        ArrayList<ComponenteElectronico> componentesSamsung = new ArrayList<>();
        componentesSamsung.add(sensorSamsung);
        componentesSamsung.add(pantallaSamsung);

        ArrayList<ComponenteElectronico> componentesApple = new ArrayList<>();
        componentesApple.add(sensorApple);
        componentesApple.add(pantallaApple);

        // Crear lista de smartphones
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        listaDeSmartphones.add(new Smartphone(componentesSamsung, 999.99f, "Samsung", "Galaxy", "Galaxy S21", "SN123456"));
        listaDeSmartphones.add(new Smartphone(componentesApple, 799.99f, "Apple", "iPhone", "iPhone 13", "SN789012"));

        // Crear componentes para las televisores
        Pantalla pantallaLG = new Pantalla(new ArrayList<>(), 199.99f, "LG", "OLED Display", "Pantalla LG", "SN345");
        Pantalla pantallaSony = new Pantalla(new ArrayList<>(), 249.99f, "Sony", "Bravia Display", "Pantalla Sony", "SN901");

        // Crear lista de televisores
        ArrayList<Television> listaDeTVs = new ArrayList<>();
        listaDeTVs.add(new Television(new ArrayList<>(), 499.99f, "LG", "OLED", "LG OLED TV", "SN345678"));
        listaDeTVs.add(new Television(new ArrayList<>(), 399.99f, "Sony", "Bravia", "Sony Bravia TV", "SN901234"));

        // Mostrar lista de smartphones
        System.out.println("Lista de Smartphones:");
        for (Smartphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone);
        }

        // Mostrar lista de televisores
        System.out.println("\nLista de Televisiones:");
        for (Television television : listaDeTVs) {
            System.out.println(television);
        }
    }
}
