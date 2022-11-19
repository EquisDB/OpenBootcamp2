package ob.ejercicio4;

public class SmartPhone extends SmartDevice {

    int screenSize;
    float androidVersion;


    public SmartPhone() {
    }

    public SmartPhone(int modelo, String numeroSerie, String color, int screenSize, float androidVersion) {
        super(modelo, numeroSerie, color);
        this.screenSize = screenSize;
        this.androidVersion = androidVersion;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "screenSize=" + screenSize +
                ", androidVersion=" + androidVersion +
                ", modelo=" + modelo +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
