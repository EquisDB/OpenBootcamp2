package ob.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un precio: ");

        int precio = scanner.nextInt();


        double precioConIva = calcularIva(precio);
        System.out.println("El precio con IVA es" + " " + precioConIva);

    }

    private static double calcularIva(double precio) {
        return precio + (precio * 0.22);


    }
}
