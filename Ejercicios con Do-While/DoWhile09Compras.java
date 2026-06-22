import java.util.Scanner;

public class DoWhile09Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precio;
        double total = 0;

        do {
            System.out.print("Ingrese precio (0 para terminar): ");
            precio = sc.nextDouble();
            total += precio;
        } while (precio != 0);

        System.out.println("Total a pagar: " + total);
    }
}