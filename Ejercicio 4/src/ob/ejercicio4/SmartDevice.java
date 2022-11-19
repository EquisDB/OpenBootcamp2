package ob.ejercicio4;

public class SmartDevice {

    //atributos

    int modelo;
    String numeroSerie;
    String color;

    //constructores


    public SmartDevice() {
    }

    public SmartDevice(int modelo, String numeroSerie, String color) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.color = color;
    }

    //to string


    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo=" + modelo +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
