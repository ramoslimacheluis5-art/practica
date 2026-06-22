import java.util.Scanner;

public class DoWhile08ContarIntentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int intentos = 0;

        do {
            System.out.print("Ingrese un numero entre 1 y 10: ");
            numero = sc.nextInt();
            intentos++;
        } while (numero < 1 || numero > 10);

        System.out.println("Intentos realizados: " + intentos);
    }
}