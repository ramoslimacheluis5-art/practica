import java.util.Scanner;

public class For05MultiplosTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }

        System.out.println("Cantidad: " + contador);
    }
}