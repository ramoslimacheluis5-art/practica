import java.util.Scanner;

public class DoWhile01NumeroPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un numero positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        System.out.println("Numero valido: " + numero);
    }
}