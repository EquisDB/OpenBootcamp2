package ob.ejercicio2;

public class Main {
    public static void main(String[] args) {

        double precioConIva = calcularIva(222);
        System.out.println(precioConIva);

    }

    private static double calcularIva(double precio) {
        return precio + (precio * 0.22);


    }
}
