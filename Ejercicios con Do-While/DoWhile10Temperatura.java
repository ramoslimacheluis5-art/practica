import java.util.Scanner;

public class DoWhile10Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.print("Ingrese grados Celsius: ");
            double c = sc.nextDouble();

            double f = (c * 9 / 5) + 32;

            System.out.println("Fahrenheit: " + f);

            System.out.println("1. Continuar");
            System.out.println("2. Salir");
            opcion = sc.nextInt();

        } while (opcion != 2);
    }
}