package ob.ejercicio4;

public class SmartWatch extends SmartDevice {

    String shape;
    String materialMalla;

    public SmartWatch() {
    }

    public SmartWatch(int modelo, String numeroSerie, String color, String shape, String materialMalla) {

        super(modelo, numeroSerie, color);
        this.shape = shape;
        this.materialMalla = materialMalla;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "shape='" + shape + '\'' +
                ", materialMalla='" + materialMalla + '\'' +
                ", modelo=" + modelo +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
