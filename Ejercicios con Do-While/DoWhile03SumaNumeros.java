import java.util.Scanner;

public class DoWhile03SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = sc.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("Suma total: " + suma);
    }
}